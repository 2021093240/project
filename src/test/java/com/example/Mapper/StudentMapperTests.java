package com.example.mapper;

import com.example.entity.StudentVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest

public class StudentMapperTests {

    @Autowired
    private StudentMapper studentMapper ;
    @Test
    public void findStudentAll(){

        List<StudentVO> studentAll = studentMapper.findStudentAll();

        studentAll.forEach(System.out::println);
    }
}
