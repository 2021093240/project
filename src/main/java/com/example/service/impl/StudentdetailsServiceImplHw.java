package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.entity.StudentdetailsHw;
import com.example.mapper.StudentdetailsHwDao;
import com.example.service.StudentdetailsHwService;

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
public class StudentdetailsServiceImplHw implements StudentdetailsHwService {
     @Resource
    private StudentdetailsHwDao studentdetailsDao;


    @Override
    public List<StudentdetailsHw> getStudentAll() {
        return studentdetailsDao.selectList(null);
    }

    @Override
    public List<StudentdetailsHw> getStudentLikeId(Integer id) {
        QueryWrapper<StudentdetailsHw> qw = new QueryWrapper<>();
        qw.like("sd_id",id);
        return studentdetailsDao.selectList(qw);
    }
    @Override
    public StudentdetailsHw getStudentById(Integer id) {
        return studentdetailsDao.selectById(id);
    }

    @Override
    public int upStudent(Integer stid, Integer zrclsid) {
        StudentdetailsHw studentdetails = new StudentdetailsHw();
        QueryWrapper<StudentdetailsHw> qw = new QueryWrapper<>();
        qw.eq("sd_id",stid);
        studentdetails.setClassId(zrclsid);
        return studentdetailsDao.update(studentdetails,qw);
    }

    @Override
    public int upStudentById(Integer id, StudentdetailsHw s) {
        QueryWrapper<StudentdetailsHw> qw = new QueryWrapper<>();
        qw.eq("sd_id",id);
        studentdetailsDao.update(s,qw);
        return 0;
    }


}
