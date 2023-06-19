package com.example.mapper;


import com.example.entity.Nav;
import com.example.entity.StudentVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class AccountMapperTests {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void findAccountAll(){

        List<Nav> navAll = accountMapper.findNavAll();

        navAll.forEach(System.out::println);

    }

    @Test
    public void findNavListTeacher(){

        List<Nav> navListTeacher = accountMapper.findNavListTeacher(1);

        navListTeacher.forEach(System.out::println);
    }

}
