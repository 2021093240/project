package project.service.impl;

import project.entity.Power;
import project.dao.PowerDao;
import project.service.PowerService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Power)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 15:03:24
 */
@Service
public class PowerServiceImpl implements PowerService {
     @Resource
    private PowerDao powerDao;

   
}
