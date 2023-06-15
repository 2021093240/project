package com.project.controller;

import com.project.entity.UpdateClazzHistory;
import com.project.service.UpdateClazzHistoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (UpdateClazzHistory)表控制层
 *
 * @author makejava
 * @since 2023-06-15 21:16:00
 */
@RestController
@RequestMapping("updateClazzHistory")
public class UpdateClazzHistoryController {
  
    @Resource
    private UpdateClazzHistoryService updateClazzHistoryService;

   
}

