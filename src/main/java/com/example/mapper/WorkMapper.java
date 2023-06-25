package com.example.mapper;

import com.example.entity.Studentdetails;
import com.example.entity.Teacher;
import com.example.entity.Work;
import com.example.entity.WorkVO;

import java.util.List;

public interface WorkMapper {


    int addWork(Work work);

    List<Work> queryWork();

    int updateByIdWord(Work work);

    int updateByIdWord2(Work work);

    List<WorkVO> findByWorkAll();

    Studentdetails findByNameWork(String sdName);
    Teacher findByNameTeacher(String teacherName);

    List<Work> findStudentNameWork(String sdName);
    List<Work> findTeacherNameWork(String teacherName);
}