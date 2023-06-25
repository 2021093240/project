package com.example.Mapper;

import com.example.entity.StudentVO;
import com.example.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class StudentMapperTest {

    @Resource
    private StudentMapper studentMapper;
    @Test
    void findStudentAll_not_pay() {
        List<StudentVO> studentAllNotPay = studentMapper.findStudentAll_not_pay();
        for (StudentVO studentVO : studentAllNotPay) {
            System.out.println("studentVO = " + studentVO);
        }
    }

    @Test
    void testFindStudentAll_not_pay() {
        List<StudentVO> studentAllNotPay = studentMapper.findStudentAll_not_pay();
        for (StudentVO studentVO : studentAllNotPay) {
            System.out.println("studentVO = " + studentVO);

        }
    }
}