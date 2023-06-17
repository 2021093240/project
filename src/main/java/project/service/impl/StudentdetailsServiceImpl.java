package project.service.impl;

import project.entity.Studentdetails;
import project.dao.StudentdetailsDao;
import project.service.StudentdetailsService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Studentdetails)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 15:03:25
 */
@Service
public class StudentdetailsServiceImpl implements StudentdetailsService {
     @Resource
    private StudentdetailsDao studentdetailsDao;

   
}
