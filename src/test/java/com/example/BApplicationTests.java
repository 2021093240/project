package com.example;

import com.example.entity.StudentVO;
import com.example.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.List;

@SpringBootTest
class BApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private StudentService studentService;
    @Test
    void contextLoads() {
    }

    @Test
    public void testConnection(){

        System.out.println(dataSource);

    }

    @Test
    public void testFindByTeacher(){

        List<StudentVO> studentAll = studentService.findStudentsAll(2, 3);

        studentAll.forEach(System.out::println);
    }

}
