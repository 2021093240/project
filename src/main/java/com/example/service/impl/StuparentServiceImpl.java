package com.example.service.impl;

import com.example.mapper.StuparentDao;
import com.example.service.StuparentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Stuparent)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
@Service
public class StuparentServiceImpl implements StuparentService {
     @Resource
    private StuparentDao stuparentDao;

   
}
