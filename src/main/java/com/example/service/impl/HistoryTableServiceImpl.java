package com.example.service.impl;

import com.example.entity.HistoryTable;
import com.example.mapper.HistoryTableDao;
import com.example.service.HistoryTableService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (HistoryTable)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
@Service
public class HistoryTableServiceImpl implements HistoryTableService {
     @Resource
    private HistoryTableDao historyTableDao;

   
}
