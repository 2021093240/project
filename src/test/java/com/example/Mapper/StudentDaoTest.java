package com.example.Mapper;

import com.example.entity.StudentVO;
import com.example.mapper.StudentDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudentDaoTest {

    @Autowired
    private StudentDao studentDao;

    @Test
    public void testStudentList(){

        List<StudentVO> studentVOS = studentDao.selectStatus();

        for (StudentVO studentVO : studentVOS) {
            System.out.println("studentVO = " + studentVO);
        }

    }

}
