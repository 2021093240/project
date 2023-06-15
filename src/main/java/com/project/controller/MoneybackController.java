package com.project.controller;

import com.project.entity.Moneyback;
import com.project.service.MoneybackService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Moneyback)表控制层
 *
 * @author makejava
 * @since 2023-06-15 21:15:59
 */
@RestController
@RequestMapping("moneyback")
public class MoneybackController {
  
    @Resource
    private MoneybackService moneybackService;

   
}

