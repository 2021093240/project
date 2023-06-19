package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.entity.Studentdetails;
import com.example.mapper.StudentdetailsDao;
import com.example.service.StudentdetailsService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Studentdetails)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
@Service
public class StudentdetailsServiceImpl implements StudentdetailsService {
     @Resource
    private StudentdetailsDao studentdetailsDao;


    @Override
    public List<Studentdetails> getStudentAll() {
        return studentdetailsDao.selectList(null);
    }

    @Override
    public List<Studentdetails> getStudentLikeId(Integer id) {
        QueryWrapper<Studentdetails> qw = new QueryWrapper<>();
        qw.like("sd_id",id);
        return studentdetailsDao.selectList(qw);
    }

    @Override
    public Studentdetails getStudentById(Integer id) {
        return studentdetailsDao.selectById(id);
    }
}
