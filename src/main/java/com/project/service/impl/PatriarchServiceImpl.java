package com.project.service.impl;

import com.project.entity.Patriarch;
import com.project.dao.PatriarchDao;
import com.project.service.PatriarchService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Patriarch)表服务实现类
 *
 * @author makejava
 * @since 2023-06-15 21:17:37
 */
@Service
public class PatriarchServiceImpl implements PatriarchService {
     @Resource
    private PatriarchDao patriarchDao;

   
}
