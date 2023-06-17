package com.example.service.impl;

import com.example.entity.ClassTable;
import com.example.mapper.ClassTableDao;
import com.example.service.ClassTableService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (ClassTable)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
@Service
public class ClassTableServiceImpl implements ClassTableService {
     @Resource
    private ClassTableDao classTableDao;

   
}
