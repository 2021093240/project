package project.service.impl;

import project.entity.Course;
import project.dao.CourseDao;
import project.service.CourseService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Course)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 15:03:23
 */
@Service
public class CourseServiceImpl implements CourseService {
     @Resource
    private CourseDao courseDao;

   
}
