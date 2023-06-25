package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.entity.Student;
import com.example.entity.StudentVO;
import com.example.entity.Studentdetails;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.entity.*;
import com.example.mapper.StudentDao;
import com.example.mapper.StudentMapper;
import com.example.mapper.StudentdetailsDao;
import com.example.service.StudentService;
import com.example.service.ex.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import javax.servlet.http.HttpSession;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper ;

    @Autowired
    private StudentDao studentDao ;

    @Override
    public List<StudentVO> findStudentsAll(Integer current,Integer pageSize) {

        current=(current-1)*pageSize ;

        List<StudentVO> studentAll = studentMapper.findStudentAll(current,pageSize);

        if(studentAll == null){

            throw new ListNotFoundException("数据为空！");
        }

        return studentAll ;
    }

    @Override
    public Studentdetails findByStudentOne(String sdName) {


        Studentdetails studentOne = null;
        try {
            studentOne = studentMapper.findByStudentOne(sdName);
        } catch (Exception e) {

            throw new UsernameDuplicateException();
        }


        if(studentOne == null){

            throw new UserNotFoundException();
        }

        return studentOne;
    }

    @Override
    public void insertStudents(StudentVO studentVO) {



        Date date = new Date() ;
        ClassTable table = studentMapper.findByClassTable(studentVO.getClassName());

        BigInteger classInt = null ;
        if(table== null){


            ClassTable classTable = new ClassTable() ;



            classTable.setClassName(studentVO.getClassName());
            classTable.setCreateTime(date);


            Integer insertClass = studentMapper.insertClass(classTable);

            classInt = studentMapper.lastInsert();
            if(insertClass != 1){

                throw new InsertException();
            }
        }

        if(studentVO == null){

            throw new DataNullException("数据为空的异常");
        }



        Teacher teacher = new Teacher();

        teacher.setTeacherName(studentVO.getTeacherName());
        teacher.setEducation("本科");
        teacher.setEntryTime(date);

        Student student = new Student();
        Teacher teacherOne = studentMapper.findByTeacherOne(studentVO.getTeacherName());
        Integer insertTeacher = -1;
        if(teacherOne == null){

            insertTeacher = studentMapper.insertTeacher(teacher);

            if(insertTeacher == null){

                throw new InsertException("添加时的未知异常");
            }


            BigInteger bigInteger = studentMapper.lastInsert();
            int tid = bigInteger.intValue();

            System.out.println("tid = " + tid+"===============");
            student.setTid(tid);
        }else{

            student.setTid(teacherOne.getTeacherId());
        }


        student.setDate(date);
        student.setCourseId(studentVO.getCourseId());
        student.setAccountId(null);
        student.setStatus(0);

        Integer insertStudent = studentMapper.insertStudent(student);

        if(insertStudent == null){

            throw new InsertException("添加出现的未知异常");

        }

        BigInteger stuId = studentMapper.lastInsert();


        Studentdetails studentdetails = new Studentdetails();

        studentdetails.setSdName(studentVO.getSdName());
        studentdetails.setSdSex(studentVO.getSdSex());
        studentdetails.setSdAge(studentVO.getSdAge());
        studentdetails.setSdAddress(studentVO.getSdAddress());
        studentdetails.setSdPhone(studentVO.getSdPhone());
        studentdetails.setSdHeadimg(studentVO.getSdHeadimg());
        studentdetails.setStuId(stuId.intValue());
        if(table == null){
            if(studentVO.getClassName() == null){
                studentdetails.setClassId(classInt.intValue());
            }else{
                studentdetails.setClassId(studentVO.getClassId());
            }
        }else{
            studentdetails.setClassId(table.getClassId());
        }


        Integer studentDetails = studentMapper.insertStudentDetails(studentdetails);

        if(studentDetails == null){

            throw new InsertException("插入时的未知异常");
        }



        List<StuParent> stuParents = studentVO.getRelationship();

        System.err.println("stuParents = " + stuParents);


        StuParent stuPare = new StuParent();

        stuPare.setStuId(stuId.intValue());
        stuPare.setParentName(studentVO.getParentName());
        stuPare.setRelation(studentVO.getRelation());
        stuPare.setPhonenum(studentVO.getPhonenum());



        Integer insertedStuParent = studentMapper.insertStuParent(stuPare);

        if(insertedStuParent == null){

            throw new InsertException("插入时期的异常");
        }

    }

    @Override
    public void deleteStudents(Integer stuId) {

        if(stuId == null){

            throw new DataNullException();
        }

        Integer delteStudent = studentMapper.delteStudent(stuId);

        if(delteStudent == null){

            throw new DeleteDataException();
        }

        Integer deleteStudentDetails = studentMapper.deleteStudentDetails(stuId);

        if(deleteStudentDetails == null){

            throw new DeleteDataException();
        }

        Integer deleteStuParent = studentMapper.deleteStuParent(stuId);

        if(deleteStuParent == null){

            throw new DeleteDataException();
        }
    }

    @Override
    public void updateStudents(Integer stuId, StudentVO studentVO) {


        if(stuId == null){

            throw new DataNullException();
        }
        if(studentVO == null){

            throw new DataNullException();
        }

        Student student = new Student();

        Date date = new Date();

        Student stu = new Student();
        stu.setDate(date);
        stu.setCourseId(studentVO.getCourseId());
        stu.setTid(studentVO.getTid());
        stu.setStatus(studentVO.getStatus());
        stu.setStuId(stuId);

        System.err.println(stu);
        Integer updateStudent = studentMapper.updateStudent(stu);

        if(updateStudent == null){

            throw new UpdateStudentException();
        }

        Studentdetails studentdetails = new Studentdetails();

        studentdetails.setSdName(studentVO.getSdName());
        studentdetails.setSdSex(studentVO.getSdSex());
        studentdetails.setSdAge(studentVO.getSdAge());
        studentdetails.setSdAddress(studentVO.getSdAddress());
        studentdetails.setSdPhone(studentVO.getSdPhone());
        studentdetails.setSdHeadimg(studentVO.getSdHeadimg());
        studentdetails.setClassId(studentVO.getClassId());
        studentdetails.setStuId(stuId);

        Integer updateStudentDetails = studentMapper.updateStudentDetails(studentdetails);

        if(updateStudentDetails == null){

            throw new UpdateStudentException();
        }


        StuParent stuParent = new StuParent();

        stuParent.setId(studentVO.getId());
        stuParent.setParentName(studentVO.getParentName());
        stuParent.setRelation(studentVO.getRelation());
        stuParent.setPhonenum(studentVO.getPhonenum());

        Integer updateStuparent = studentMapper.updateStuparent(stuParent);

        if(updateStuparent == null){

            throw new UpdateStudentException();
        }


    }

    @Override
    public List<StudentVO> findStuNameAll(String sdName) {

        sdName = "%"+sdName+"%";
        List<StudentVO> stuNameAll = studentMapper.findStuNameAll(sdName);


        return stuNameAll;
    }

    @Override
    public Integer findAllStudent() {
        return studentMapper.findAllStudent();
    }

    @Override
    public StudentVO updateByAllOne(Integer stuId) {

        if(stuId == null){

            throw new DataNullException();
        }

        StudentVO studentVO = studentMapper.updateByAllOne(stuId);

        if(studentVO == null){

            throw new ListNotFoundException();
        }
        return studentVO;
    }

    @Override
    public List<ClassTable> findByClassNameAll() {

        return studentMapper.findByClassNameAll();
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
        student.setTid(studentVO.getTid());
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
        student.setTid(1);
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
