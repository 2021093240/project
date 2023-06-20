package com.example.service.impl;

import com.example.entity.*;
import com.example.mapper.AccountDao;
import com.example.mapper.StudentDao;
import com.example.mapper.TeacherDao;
import com.example.service.TeacherService;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import com.example.service.ex.*;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * (Teacher)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
@Service
public class TeacherServiceImpl implements TeacherService {
     @Resource
    private TeacherDao teacherDao;

     @Autowired
     private AccountDao accountDao;

     @Autowired
     private StudentDao studentDao;

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

    //加密密码
    public String getMd5Password(String salt,String password){
        for (int i = 0; i < 3; i++) {
            password = DigestUtils.md5DigestAsHex((salt + password + salt).getBytes()).toUpperCase();
        }
        return password;
    }




}
