package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.Teacher_nav_mid;

public interface Teacher_nav_midMapper extends BaseMapper<Teacher_nav_mid> {
    int deleteByid(int id);
}
