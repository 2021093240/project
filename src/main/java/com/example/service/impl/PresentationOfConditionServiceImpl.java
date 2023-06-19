package com.example.service.impl;

import com.example.mapper.PresentationOfConditionDao;
import com.example.service.PresentationOfConditionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (PresentationOfCondition)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
@Service
public class PresentationOfConditionServiceImpl implements PresentationOfConditionService {
     @Resource
    private PresentationOfConditionDao presentationOfConditionDao;

   
}
