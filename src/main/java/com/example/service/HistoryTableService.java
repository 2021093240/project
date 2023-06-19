package com.example.service;

import com.example.entity.HistoryTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * (HistoryTable)表服务接口
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */

public interface HistoryTableService {
    int setHistoryTable(HistoryTable historyTable);
}
