package project.service.impl;

import project.entity.ClassTable;
import project.dao.ClassTableDao;
import project.service.ClassTableService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (ClassTable)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 15:03:23
 */
@Service
public class ClassTableServiceImpl implements ClassTableService {
     @Resource
    private ClassTableDao classTableDao;

   
}
