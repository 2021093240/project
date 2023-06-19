package com.example.service;

import com.example.entity.HistoryTable;
import com.example.entity.Studentdetails;
import java.util.List;


/**
 * (Studentdetails)表服务接口
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
 
public interface StudentdetailsService {
    List<Studentdetails> getStudentAll();
    List<Studentdetails> getStudentLikeId(Integer id);
    Studentdetails getStudentById(Integer id);


}
