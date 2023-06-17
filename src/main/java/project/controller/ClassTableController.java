package project.controller;

import project.entity.ClassTable;
import project.service.ClassTableService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (ClassTable)表控制层
 *
 * @author makejava
 * @since 2023-06-17 15:03:23
 */
@RestController
@RequestMapping("classTable")
public class ClassTableController {
  
    @Resource
    private ClassTableService classTableService;

   
}

