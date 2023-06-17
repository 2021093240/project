package project.service.impl;

import project.entity.Applydetail;
import project.dao.ApplydetailDao;
import project.service.ApplydetailService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Applydetail)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 15:03:23
 */
@Service
public class ApplydetailServiceImpl implements ApplydetailService {
     @Resource
    private ApplydetailDao applydetailDao;

   
}
