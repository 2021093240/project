package com.example.service;

import com.example.entity.HistoryTableHw;

import java.util.List;


/**
 * (HistoryTable)表服务接口
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */

public interface HistoryTableServiceHw {

    int setHistoryTable(HistoryTableHw historyTable);

    List<HistoryTableHw> getHistoryTableAll();

    int uphistory1(Integer id);
    int uphistory2(Integer id);

    int delhistory(Integer id);

    HistoryTableHw getHistoryTableByid(Integer id);
}
