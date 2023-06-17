package project.service.impl;

import project.entity.Student;
import project.dao.StudentDao;
import project.service.StudentService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Student)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 15:03:25
 */
@Service
public class StudentServiceImpl implements StudentService {
     @Resource
    private StudentDao studentDao;

   
}
