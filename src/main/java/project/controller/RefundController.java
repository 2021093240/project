package project.controller;

import project.entity.Refund;
import project.service.RefundService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Refund)表控制层
 *
 * @author makejava
 * @since 2023-06-17 15:03:24
 */
@RestController
@RequestMapping("refund")
public class RefundController {
  
    @Resource
    private RefundService refundService;

   
}

