package project.controller;

import project.entity.Power;
import project.service.PowerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Power)表控制层
 *
 * @author makejava
 * @since 2023-06-17 15:03:24
 */
@RestController
@RequestMapping("power")
public class PowerController {
  
    @Resource
    private PowerService powerService;

   
}

