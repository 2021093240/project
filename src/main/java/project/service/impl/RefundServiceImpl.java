package project.service.impl;

import project.entity.Refund;
import project.dao.RefundDao;
import project.service.RefundService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Refund)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 15:03:24
 */
@Service
public class RefundServiceImpl implements RefundService {
     @Resource
    private RefundDao refundDao;

   
}
