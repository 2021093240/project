package com.example.mapper;

import com.example.entity.TeacherHw;
import com.example.entity.Teacher;
import com.example.entity.Employee;
import com.example.entity.TeacherNavMid;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.math.BigInteger;

/**
 * (Teacher)表数据库访问层
 *
 * @author makejava
 * @since 2023-06-17 17:29:48
 */
 
public interface TeacherDao extends BaseMapper<Teacher>{

    List<TeacherNavMid> getTeacherNavMid(Integer tid);

    int insertTeacherNavMid(int tid,int nid);

    int deleteNid(Integer nid,Integer tid);

    int updatePassword(String password, Integer power, Date date,String username, Integer id);

    BigInteger insertTeacherId();
}
