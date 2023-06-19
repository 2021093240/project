package com.example.controller;

import com.example.service.PresentationOfConditionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (PresentationOfCondition)表控制层
 *
 * @author makejava
 * @since 2023-06-17 17:52:24
 */
@RestController
@RequestMapping("presentationOfCondition")
public class PresentationOfConditionController {
  
    @Resource
    private PresentationOfConditionService presentationOfConditionService;

   
}

