package com.example.service.impl;

import com.example.entity.Studentdetails;
import com.example.entity.Teacher;
import com.example.entity.Work;
import com.example.entity.WorkVO;
import com.example.mapper.WorkMapper;
import com.example.service.WorkService;
import com.example.service.ex.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {

    @Autowired
    private WorkMapper workMapper;


    @Override
    public int addWork(Work work) {


        String sdName = work.getSdName();
        Studentdetails byNameWork = workMapper.findByNameWork(sdName);

        String teacherName = work.getTeacherName();
        Teacher byNameTeacher = workMapper.findByNameTeacher(teacherName);


        if (byNameWork == null || byNameTeacher == null) {
            throw new WorkByNameException("没有该学生或老师");
        }


        Date date = new Date();
        work.setTime(date);
        work.setStates("待处理");

        int i = workMapper.addWork(work);

        if (i != 1) {
            throw new InsertException("添加数据时，产生未知的异常，请联系后端人员");
        }
        return i;
    }

    @Override
    public List<Work> queryWork() {

        List<Work> works = workMapper.queryWork();
        if (works == null) {
            throw new QueryException("查询数据时，产生未知的异常，请联系后端人员");
        }
        return works;

    }

    @Override
    public int updateByIdWord(Work work) {

        work.setId(work.getId());
        work.setStates("同意");

        int i = workMapper.updateByIdWord(work);

        if (i != 1) {
            throw new UpdateException("状态产生未知的异常，请联系后端人员");
        }
        return i;
    }

    @Override
    public int updateByIdWord2(Work work) {
        work.setId(work.getId());
        work.setStates("已拒绝");

        int i = workMapper.updateByIdWord2(work);

        if (i != 1) {
            throw new UpdateException("状态产生未知的异常，请联系后端人员");
        }
        return i;
    }

    @Override
    public List<WorkVO> findByWorkAll() {

        List<WorkVO> byWorkAll = workMapper.findByWorkAll();

        if (byWorkAll == null) {
            throw new QueryException("查询数据时，产生未知的异常，请联系后端人员");

        }
        return byWorkAll;
    }

    @Override
    public List<Work> findStudentNameWork(String sdName) {

        Studentdetails byNameWork = workMapper.findByNameWork(sdName);

        if (byNameWork == null) {
            throw new NameException("请输入正确的姓名");
        }


        List<Work> works = workMapper.findStudentNameWork(sdName);

        if (works == null) {
            throw new QueryException("查询数据时，产生未知的异常，请联系后端人员");
        }
        return works;


    }

    @Override
    public List<Work> findTeacherNameWork(String teacherName) {


        Teacher byNameTeacher = workMapper.findByNameTeacher(teacherName);
        if (byNameTeacher == null) {
            throw new NameException("请输入正确的姓名");
        }

        List<Work> works = workMapper.findTeacherNameWork(teacherName);

        if (works == null) {
            throw new QueryException("查询数据时，产生未知的异常，请联系后端人员");
        }
        return works;
    }


}
