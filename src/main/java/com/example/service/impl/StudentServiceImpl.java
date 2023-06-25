package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.entity.Student;
import com.example.entity.StudentVO;
import com.example.entity.Studentdetails;
import com.example.mapper.StudentDao;
import com.example.mapper.StudentMapper;
import com.example.mapper.StudentdetailsDao;
import com.example.service.StudentService;
import com.example.service.ex.ListNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper ;

    @Autowired
    private StudentDao studentDao ;

    @Override
    public List<StudentVO> findStudentAll() {

        List<StudentVO> studentAll = studentMapper.findStudentAll();

        if(studentAll == null){

            throw new ListNotFoundException("数据为空！");
        }

        return studentAll ;
    }

    @Override
    public List<StudentVO> selectStatus() {

        List<StudentVO> studentVOS = studentDao.selectStatus();

        return studentVOS;
    }

    @Override
    public List<StudentVO> findStudentAll_like_name(String name) {
        name="%"+ name + "%";
        List<StudentVO> studentAllLikeName = studentMapper.findStudentAll_like_name(name);
        return studentAllLikeName;
    }

    @Resource
    private StudentdetailsDao sStudentdetailsDaol;
    @Override
    public int del(Integer id) {
        QueryWrapper<Student> studentQueryWrapper = new QueryWrapper<>();
        studentQueryWrapper.eq("stu_id", id);
        int delete1 = studentDao.delete(studentQueryWrapper);

        QueryWrapper<Studentdetails> studentdetailsQueryWrapper = new QueryWrapper<>();
        studentdetailsQueryWrapper.eq("stu_id",id);
        int delete = sStudentdetailsDaol.delete(studentdetailsQueryWrapper);

        if (delete1==1&&delete==1){
            return 1;
        }
        return 0;
    }

    @Override
    public int update_stu(StudentVO studentVO) {
        if (studentVO.getSdName()==null){
            return 0;
        }
        UpdateWrapper<Student> studentUpdateWrapper = new UpdateWrapper<>();
        Student student = new Student();
        student.setStuId(studentVO.getStuId());
        student.setCourseId(studentVO.getClassId());
        student.setTid(studentVO.getTeacherId());
        studentUpdateWrapper.set("course_id", student.getCourseId());
        studentUpdateWrapper.set("tid", student.getTid());
        studentUpdateWrapper.eq("stu_id", student.getStuId());
        int update = studentDao.update(student, studentUpdateWrapper);

        UpdateWrapper<Studentdetails> studentdetailsUpdateWrapper = new UpdateWrapper<>();
        Studentdetails studentdetails = new Studentdetails();
        studentdetails.setStuId(studentVO.getStuId());
        studentdetails.setSdSex(studentVO.getSdSex());
        studentdetails.setSdAge(studentVO.getSdAge());
        studentdetails.setSdAddress(studentVO.getSdAddress());
        studentdetails.setSdPhone(studentVO.getSdPhone());
        studentdetailsUpdateWrapper.set("sd_sex",studentdetails.getSdSex());
        studentdetailsUpdateWrapper.set("sd_age",studentdetails.getSdAge());
        studentdetailsUpdateWrapper.set("sd_address",studentdetails.getSdAddress());
        studentdetailsUpdateWrapper.set("sd_phone",studentdetails.getSdPhone());
        studentdetailsUpdateWrapper.eq("stu_id",studentdetails.getStuId());
        int update1 = sStudentdetailsDaol.update(studentdetails, studentdetailsUpdateWrapper);
        if (update1==1&&update==1){
            return 1;
        }

        return 0;
    }

    @Override
    public int insert_stu(StudentVO studentVO) {
        if(studentVO.getSdName()==null){
            return 0;
        }
        Student student = new Student();

        student.setCourseId(1);
        student.setTid("1");
        student.setDate(new Date());
        student.setStatus(0);
        int insert = studentDao.insert(student);


        Studentdetails studentdetails = new Studentdetails();
        studentdetails.setSdSex(studentVO.getSdSex());
        studentdetails.setSdAge(studentVO.getSdAge());
        studentdetails.setSdAddress(studentVO.getSdAddress());
        studentdetails.setSdPhone(studentVO.getSdPhone());
        studentdetails.setStuId(student.getStuId());
        studentdetails.setSdName(studentVO.getSdName());

        int insert1 = sStudentdetailsDaol.insert(studentdetails);

        if (insert1==1&&insert==1){
            return 1;
        }

        return 0;
    }

    @Override
    public int query_tid(int tid) {
        QueryWrapper<Student> studentQueryWrapper = new QueryWrapper<>();
        studentQueryWrapper.eq("tid",tid);
        List<Student> students = studentDao.selectList(studentQueryWrapper);
        return students.size();
    }

    @Override
    public StudentVO query_stuSelfById(int id) {
        StudentVO studentVO = studentMapper.quert_detail(id);
        return studentVO;
    }

    @Override
    public int update_pay(Integer id) {

        QueryWrapper<Student> studentQueryWrapper1 = new QueryWrapper<>();
        studentQueryWrapper1.eq("stu_id", id);
        Student student1 = studentDao.selectOne(studentQueryWrapper1);

        UpdateWrapper<Student> studentUpdateWrapper = new UpdateWrapper<>();
        studentUpdateWrapper.eq("stu_id",student1.getStuId());
        if (student1.getStatus()==1){
            studentUpdateWrapper.set("status",0);
        }else {
            studentUpdateWrapper.set("status",1);
        }
        int update = studentDao.update(student1, studentUpdateWrapper);

        if (update == 1){
            return 1;
        }
        return 0;
    }



    @Override
    public HashMap findStudentAll_not_pay(int limitNum , int  count) {

        List<StudentVO> studentAllNotPay = studentMapper.findStudentAll_not_pay();

        List<StudentVO> studentVOS = new ArrayList<>();
        //3    10
        int  start=(limitNum-1)*count;
        int end=start+count;//30
        if (end>studentAllNotPay.size()){
            int i = studentAllNotPay.size() -end;
            end=end+i;
        }

        for (int i = start; i < end; i++) {
            studentVOS.add(studentAllNotPay.get(i));
        }

        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("total",studentAllNotPay.size());
        objectObjectHashMap.put("pagination",limitNum);
        objectObjectHashMap.put("pages" +
                "ize",end-start);
        objectObjectHashMap.put("studentVOS",studentVOS);

        return objectObjectHashMap;
    }
}
