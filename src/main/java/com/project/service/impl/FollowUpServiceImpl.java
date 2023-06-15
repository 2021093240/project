package com.project.service.impl;

import com.project.entity.FollowUp;
import com.project.dao.FollowUpDao;
import com.project.service.FollowUpService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (FollowUp)表服务实现类
 *
 * @author makejava
 * @since 2023-06-15 21:17:37
 */
@Service
public class FollowUpServiceImpl implements FollowUpService {
     @Resource
    private FollowUpDao followUpDao;

   
}
