package project.controller;

import project.entity.CompetentTeacher;
import project.service.CompetentTeacherService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (CompetentTeacher)表控制层
 *
 * @author makejava
 * @since 2023-06-17 15:03:23
 */
@RestController
@RequestMapping("competentTeacher")
public class CompetentTeacherController {
  
    @Resource
    private CompetentTeacherService competentTeacherService;

   
}

