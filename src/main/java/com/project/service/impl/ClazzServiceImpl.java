package com.project.service.impl;

import com.project.entity.Clazz;
import com.project.dao.ClazzDao;
import com.project.service.ClazzService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Clazz)表服务实现类
 *
 * @author makejava
 * @since 2023-06-15 21:17:37
 */
@Service
public class ClazzServiceImpl implements ClazzService {
     @Resource
    private ClazzDao clazzDao;

   
}
