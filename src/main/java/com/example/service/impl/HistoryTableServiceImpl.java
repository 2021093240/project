package com.example.service.impl;

import com.example.entity.HistoryTable;
import com.example.mapper.HistoryTableMapper;
import com.example.service.HistoryTableService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HistoryTableServiceImpl implements HistoryTableService {

    @Autowired
    private HistoryTableMapper historyTableMapper;

    @Override
    public List<HistoryTable> queryHistoryTable() {

        List<HistoryTable> historyTables = historyTableMapper.queryHistoryTable();

        if (historyTables == null){



        }

        return null;
    }
}
