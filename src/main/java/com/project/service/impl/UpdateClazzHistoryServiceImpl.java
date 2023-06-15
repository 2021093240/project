package com.project.service.impl;

import com.project.entity.UpdateClazzHistory;
import com.project.dao.UpdateClazzHistoryDao;
import com.project.service.UpdateClazzHistoryService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (UpdateClazzHistory)表服务实现类
 *
 * @author makejava
 * @since 2023-06-15 21:17:37
 */
@Service
public class UpdateClazzHistoryServiceImpl implements UpdateClazzHistoryService {
     @Resource
    private UpdateClazzHistoryDao updateClazzHistoryDao;

   
}
