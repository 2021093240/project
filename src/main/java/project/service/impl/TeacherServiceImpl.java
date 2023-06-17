package project.service.impl;

import project.entity.Teacher;
import project.dao.TeacherDao;
import project.service.TeacherService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Teacher)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 15:03:25
 */
@Service
public class TeacherServiceImpl implements TeacherService {
     @Resource
    private TeacherDao teacherDao;

   
}
