package com.project.service.impl;

import com.project.entity.FollowUpSign;
import com.project.dao.FollowUpSignDao;
import com.project.service.FollowUpSignService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (FollowUpSign)表服务实现类
 *
 * @author makejava
 * @since 2023-06-15 21:17:37
 */
@Service
public class FollowUpSignServiceImpl implements FollowUpSignService {
     @Resource
    private FollowUpSignDao followUpSignDao;

   
}
