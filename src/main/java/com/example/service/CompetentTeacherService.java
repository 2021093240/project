package com.example.service;

import com.example.entity.CompetentTeacher;

import java.util.List;

/**
 * (CompetentTeacher)表服务接口
 *
 * @author makejava
 * @since 2023-06-20 15:20:14
 */
public interface CompetentTeacherService {
    List<CompetentTeacher> query_all();
    CompetentTeacher query_ctid(int ctid);
}
