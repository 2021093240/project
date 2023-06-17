package com.example.service.impl;

import com.example.entity.Remark;
import com.example.mapper.RemarkDao;
import com.example.service.RemarkService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Remark)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
@Service
public class RemarkServiceImpl implements RemarkService {
     @Resource
    private RemarkDao remarkDao;

   
}
