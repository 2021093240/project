package service.impl;

import org.springframework.stereotype.Service;
import service.ApplydetailService;
import com.example.mapper.ApplydetailDao;
import javax.annotation.Resource;

/**
 * (Applydetail)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 17:32:20
 */
@Service
public class ApplydetailServiceImpl implements ApplydetailService {
     @Resource
    private ApplydetailDao applydetailDao;

   
}
