package com.example.service;

import com.example.entity.Student;
import com.example.entity.StudentVO;

import java.util.List;
import java.util.Map;


/**
 * (Student)表服务接口
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
 
public interface StudentService {

    List<StudentVO> selectStatus();

}
