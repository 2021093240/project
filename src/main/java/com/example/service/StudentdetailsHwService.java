package com.example.service;

import com.example.entity.StudentdetailsHw;
import java.util.List;


/**
 * (Studentdetails)表服务接口
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
 
public interface StudentdetailsHwService {
    //学生表
    List<StudentdetailsHw> getStudentAll();

    List<StudentdetailsHw> getStudentLikeId(Integer id);
    StudentdetailsHw getStudentById(Integer id);

    int upStudent(Integer stid,Integer zrclsid);

    int upStudentById(Integer id, StudentdetailsHw s);

}
