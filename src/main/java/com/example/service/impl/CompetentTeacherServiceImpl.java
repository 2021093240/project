package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.entity.CompetentTeacher;
import com.example.mapper.CompetentTeacherDao;
import com.example.service.CompetentTeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CompetentTeacher)表服务实现类
 *
 * @author makejava
 * @since 2023-06-20 15:20:14
 */
@Service
public class CompetentTeacherServiceImpl implements CompetentTeacherService {
    @Resource
    private CompetentTeacherDao competentTeacherDao;


    @Override
    public List<CompetentTeacher> query_all() {
        return competentTeacherDao.selectList(null);
    }

    @Override
    public CompetentTeacher query_ctid(int ctid) {
        QueryWrapper<CompetentTeacher> competentTeacherQueryWrapper = new QueryWrapper<>();
        competentTeacherQueryWrapper.eq("ctid", ctid);
        CompetentTeacher competentTeacher = competentTeacherDao.selectOne(competentTeacherQueryWrapper);
        return competentTeacher;
    }
}
