package com.example.service;

import com.example.entity.ClassTable;
import com.example.entity.HistoryTable2;

import java.util.List;
import java.util.Map;


/**
 * (ClassTable)表服务接口
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
 
public interface ClassTableService {
    List<ClassTable> getClassTableAll();
    ClassTable getById(Integer id);
}
