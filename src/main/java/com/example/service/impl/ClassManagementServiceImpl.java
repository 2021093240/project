package com.example.service.impl;

import com.example.entity.HistoryTable2;
import com.example.mapper.ClassManagement;
import com.example.service.ClassManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassManagementServiceImpl implements ClassManagementService {
    @Autowired
    private ClassManagement classManagement;
    @Override
    public List<HistoryTable2> getClassAll() {
        return classManagement.getClassAll();
    }

}
