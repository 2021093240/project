package com.example.service.impl;

import com.example.entity.Power;
import com.example.mapper.PowerDao;
import com.example.service.PowerService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Power)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
@Service
public class PowerServiceImpl implements PowerService {
     @Resource
    private PowerDao powerDao;

   
}
