package com.example.service;

import com.example.entity.ClassTable;

import java.util.List;


/**
 * (ClassTable)表服务接口
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
 
public interface ClassTableServiceHw {

    List<ClassTable> getClassTableAll();
    ClassTable getById(Integer id);
}
