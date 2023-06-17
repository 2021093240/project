package project.controller;

import project.entity.Applydetail;
import project.service.ApplydetailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Applydetail)表控制层
 *
 * @author makejava
 * @since 2023-06-17 15:03:23
 */
@RestController
@RequestMapping("applydetail")
public class ApplydetailController {
  
    @Resource
    private ApplydetailService applydetailService;

   
}

