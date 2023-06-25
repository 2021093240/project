package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.entity.Account;
import com.example.entity.Teacher;
import com.example.entity.Teacher_nav_mid;
import com.example.mapper.*;
import com.example.entity.*;
import com.example.mapper.AccountMapper;
import com.example.service.TeacherService;
import com.example.service.ex.DeleteException;
import com.example.service.ex.InsertException;
import com.example.service.ex.TeacherNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import com.example.service.ex.*;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class TeacherServiceImpl implements TeacherService {
     @Resource
    private TeacherDao teacherDao;

     @Autowired
     private AccountMapper accountDao;

     @Autowired
     private StudentDao studentDao;

    @Autowired
    private TeacherDao mapper;
    @Autowired
    private IAccountMapper iAccountMapper;
    @Autowired
    private Teacher_nav_midMapper teacherNavMidMapper;

    @Override
    public void updateTeacher(Employee teacher,String username) {

        if(teacher.getName() == null){
            throw new TeacherNotFound("老师信息不存在");
        }

        if(teacher.getNav() == null){
            throw new NavPointNotNull("至少需要一个权限");
        }

        Teacher updateteacher = new Teacher();
        updateteacher.setTeacherId(teacher.getId());
        updateteacher.setTeacherName(teacher.getName());
        updateteacher.setContactWay(teacher.getContactWay());
        updateteacher.setEducation(teacher.getEducation());

        int i1 = teacherDao.updateById(updateteacher);

        if(i1<0){
            throw new UpdateTeacherException("修改老师信息及权限发生错误");
        }

        //老师权限中间表中的老师权限
        List<TeacherNavMid> tids = teacherDao.getTeacherNavMid(teacher.getId());

        //前端的老师权限
        List<Integer> navs = teacher.getNav();

        //如果老师表中没数据
        if(tids == null){
            for (Integer nid : navs) {
                int i = teacherDao.insertTeacherNavMid(teacher.getId(), nid);
                if(i<1){
                    throw new InsertTeacherNavMidException("新增数据时发生不可预测的异常");
                }
            }
        //如果老师表中有权限数据
        }else{
            //遍历前端传入的nid
            for (int nid : navs) {
                //判断tids中有没有当前的nid，如果没有就添加
                boolean isAllDifferent1 = tids.stream().allMatch(obj -> obj.getNid() != nid);

                if(isAllDifferent1){
                    int i = teacherDao.insertTeacherNavMid(teacher.getId(), nid);
                    if(i < 1){
                        throw new InsertTeacherNavMidException("新增数据时发生不可预测的异常");
                    }
                }

            }

            //遍历中间表中的老师权限
            for (TeacherNavMid tid : tids) {

                //判断前端传过来的数组中有没有nid
                boolean isAllDifferent1 = navs.stream().allMatch(nid -> nid != tid.getNid());

                if(isAllDifferent1){
                    int i = teacherDao.deleteNid(tid.getNid(),teacher.getId());
                    if(i<0){
                        throw new UpdateTeacherException("修改老师信息及权限发生错误");
                    }
                }
            }
        }

        Teacher result = teacherDao.selectById(teacher.getId());

        Account account = accountDao.selectById(result.getAccountId());

        if(account == null){
            throw new UserNotFountException("用户找不到");
        }

        String salt = account.getSalt();

        String md5Password = getMd5Password(salt,teacher.getPassword());

        Date date = new Date();

        int i = teacherDao.updatePassword(md5Password,teacher.getPower(),date,username,account.getId());

        if(i<1){
            throw new UpdateTeacherException("修改信息发生错误");
        }

    }

    @Override
    public List<StudentVO> selectStatus() {
        return studentDao.selectStatus();
    }

    @Override
    public List<Teacher> findAll() {//查询老师所有信息
        QueryWrapper<Teacher> wrapper=new QueryWrapper<>();
        List<Teacher> teachers = mapper.selectList(wrapper);
        return teachers;
    }

    @Override
    public void deleteTea(int id) {
        Teacher teacher = mapper.selectById(id);
        int accountId = iAccountMapper.deleteById(teacher.getAccountId());
        int navId = teacherNavMidMapper.deleteByid(id);
        int Teaid = mapper.deleteById(id);
        if (Teaid!=1 && accountId!=1 && navId!=1){
            throw new DeleteException("删除数据时，产生未知异常!");
        }
    }

    @Override
    public void add(Teacher teacher) {
        Date date=new Date();
        teacher.setEntryTime(date);
        int insert = mapper.insert(teacher);
        if (insert!=1){
            throw new InsertException("添加数据时,产生未知异常!");
        }
    }

    @Override
    public void insertAccount(Account account) {
        Date date=new Date();
        String upperCase = UUID.randomUUID().toString().toUpperCase();
        String md5Password = getMd5Password(account.getPassword(), upperCase);
        account.setPassword(md5Password);
        account.setSalt(upperCase);
        account.setCreatedUser(account.getUsername());
        account.setCreatedTime(date);
        account.setModifiedUser(account.getUsername());
        account.setModifiedTime(date);
        int insert = iAccountMapper.insert(account);
        if (insert!=1){
            throw new InsertException("添加数据时,产生未知异常！");
        }
    }
    @Override
    public void addTeacher_nav(Teacher_nav_mid teacherNavMid) {
        int insert = teacherNavMidMapper.insert(teacherNavMid);
        if (insert!=1){
            throw new InsertException("添加数据时,产生未知异常！");
        }
    }
    @Override
    public int insertAccountId() {
        BigInteger bigInteger = iAccountMapper.insertAccountId();
        int i = bigInteger.intValue();
        return i;
    }

    @Override
    public int insertTeacherId() {
        BigInteger bigInteger = mapper.insertTeacherId();
        int i = bigInteger.intValue();
        return i;
    }

    @Override
    public List<Teacher> findlikeName(String name) {
        QueryWrapper<Teacher> wrapper=new QueryWrapper<Teacher>();
        wrapper.like("teacher_name",name);
        List<Teacher> teachers = mapper.selectList(wrapper);
        return teachers;
    }
    @Override
    public Teacher findById(int tid) {
        return mapper.selectById(tid);
    }


    //加密密码
    public String getMd5Password(String salt,String password){
        for (int i = 0; i < 3; i++) {
            password = DigestUtils.md5DigestAsHex((salt + password + salt).getBytes()).toUpperCase();
        }
        return password;
    }


    @Override
    public List<Teacher> count_teacher() {
        List<Teacher> teachers = teacherDao.selectList(null);
        return teachers;
    }

    @Override
    public List<Teacher> query_ctid(Integer ctid) {
        QueryWrapper<Teacher> teacherQueryWrapper = new QueryWrapper<>();
        teacherQueryWrapper.eq("ctid",ctid);
        List<Teacher> teachers = teacherDao.selectList(teacherQueryWrapper);
        return teachers;
    }

}
