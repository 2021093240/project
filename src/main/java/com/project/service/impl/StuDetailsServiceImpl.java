package com.project.service.impl;

import com.project.entity.StuDetails;
import com.project.dao.StuDetailsDao;
import com.project.service.StuDetailsService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (StuDetails)表服务实现类
 *
 * @author makejava
 * @since 2023-06-15 21:17:37
 */
@Service
public class StuDetailsServiceImpl implements StuDetailsService {
     @Resource
    private StuDetailsDao stuDetailsDao;

   
}
