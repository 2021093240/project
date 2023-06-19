package com.example.service.impl;

import com.example.entity.ClassTable;
import com.example.mapper.ClassTableDao;
import com.example.service.ClassTableService;

import javax.annotation.Resource;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (ClassTable)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
@Service
public class ClassTableServiceImpl implements ClassTableService {
    @Autowired
    private ClassTableDao classTableDao;


    @Override
    public List<ClassTable> getClassTableAll() {
        return classTableDao.selectList(null);
    }

    @Override
    public ClassTable getById(Integer id) {
        ClassTable classTable = classTableDao.selectById(id);

        return classTable;
    }
}
