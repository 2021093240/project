package com.example.service;

import com.example.entity.Work;
import com.example.entity.WorkVO;
import java.util.List;

public interface WorkService {

    int addWork(Work work);
    List<Work> queryWork();
    int updateByIdWord(Work work);
    int updateByIdWord2(Work work);
    List<WorkVO> findByWorkAll();

    List<Work> findStudentNameWork(String sdName);
    List<Work> findTeacherNameWork(String teacherName);
}




