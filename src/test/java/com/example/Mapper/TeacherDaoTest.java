package com.example.Mapper;

import com.example.entity.TeacherNavMid;
import com.example.mapper.TeacherDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TeacherDaoTest {

    @Autowired
    private TeacherDao teacherDao;

    @Test
    public void testTeacherDao(){

        List<TeacherNavMid> teacherNavMid = teacherDao.getTeacherNavMid(1);

        System.out.println(teacherNavMid);

    }

    @Test
    public void insertTeacherNavMid(){

        int i = teacherDao.insertTeacherNavMid(1, 6);

        System.err.println(i);

    }

    @Test
    public void deleteTeacherNavMid(){

        int i = teacherDao.deleteNid(6, 7);

        System.err.println(i);

    }

}
