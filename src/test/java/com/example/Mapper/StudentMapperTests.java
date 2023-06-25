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

        List<StudentVO> studentAll = studentMapper.findStudentAll(1,3);

        studentAll.forEach(System.out::println);
    }

    @Test
    public void findStudentAll2(){

        Integer allStudent = studentMapper.findAllStudent();

        System.err.println("allStudent = " + allStudent);
    }

    @Test
    public void SessionTests(){


    }
}
