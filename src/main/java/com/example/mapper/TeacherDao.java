package com.example.mapper;

import com.example.entity.Teacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.math.BigInteger;

/**
 * (Teacher)表数据库访问层
 *
 * @author makejava
 * @since 2023-06-17 17:29:48
 */
 
public interface TeacherDao extends BaseMapper<Teacher>{
    BigInteger insertTeacherId();
}
