package project.service.impl;

import project.entity.CompetentTeacher;
import project.dao.CompetentTeacherDao;
import project.service.CompetentTeacherService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (CompetentTeacher)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 15:03:23
 */
@Service
public class CompetentTeacherServiceImpl implements CompetentTeacherService {
     @Resource
    private CompetentTeacherDao competentTeacherDao;

   
}
