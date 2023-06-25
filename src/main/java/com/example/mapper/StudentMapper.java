package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.*;

import java.math.BigInteger;
import java.util.List;

public interface StudentMapper extends BaseMapper<StudentVO> {

    List<StudentVO> findStudentAll(Integer current,Integer pageSize);

    List<StudentVO> findStuNameAll(String sdName);
    Integer insertStudent(Student student);
    Integer insertStudentDetails(Studentdetails studentdetails);

    Integer insertTeacher(Teacher teacher);

    Integer insertStuParent(StuParent stuParent);

    Integer insertClass(ClassTable classTable);

    Teacher findByTeacherOne(String teacherName);

    BigInteger lastInsert();

    Studentdetails findByStudentOne(String sdName);

    Integer delteStudent(Integer stuId);

    Integer deleteStudentDetails(Integer stuId);

    Integer deleteStuParent(Integer stuId);


    Integer updateStudent(Student student);

    Integer updateStudentDetails(Studentdetails studentdetails);

    Integer updateStuparent(StuParent stuParent);

    Integer findAllStudent();

    StudentVO updateByAllOne(Integer stuId);

    ClassTable findByClassTable(String className);

    List<ClassTable> findByClassNameAll();

    List<StudentVO> findStudentAll_not_pay();
    List<StudentVO> findStudentAll_like_name(String name);
    StudentVO quert_detail(Integer id);
}
