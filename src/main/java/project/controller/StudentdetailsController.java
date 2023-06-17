package project.controller;

import project.entity.Studentdetails;
import project.service.StudentdetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Studentdetails)表控制层
 *
 * @author makejava
 * @since 2023-06-17 15:03:25
 */
@RestController
@RequestMapping("studentdetails")
public class StudentdetailsController {
  
    @Resource
    private StudentdetailsService studentdetailsService;

   
}

