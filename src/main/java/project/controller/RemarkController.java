package project.controller;

import project.entity.Remark;
import project.service.RemarkService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Remark)表控制层
 *
 * @author makejava
 * @since 2023-06-17 15:03:24
 */
@RestController
@RequestMapping("remark")
public class RemarkController {
  
    @Resource
    private RemarkService remarkService;

   
}

