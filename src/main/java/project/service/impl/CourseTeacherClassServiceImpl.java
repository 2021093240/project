package project.service.impl;

import project.entity.CourseTeacherClass;
import project.dao.CourseTeacherClassDao;
import project.service.CourseTeacherClassService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (CourseTeacherClass)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 15:03:24
 */
@Service
public class CourseTeacherClassServiceImpl implements CourseTeacherClassService {
     @Resource
    private CourseTeacherClassDao courseTeacherClassDao;

   
}
