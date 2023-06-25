package com.example.controller;

import com.example.service.HistoryTableServiceHw;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (HistoryTable)表控制层
 *
 * @author makejava
 * @since 2023-06-17 17:52:24
 */
@RestController
@RequestMapping("historyTable")
public class HistoryTableController {
  
    @Resource
    private HistoryTableServiceHw historyTableService;

   
}

