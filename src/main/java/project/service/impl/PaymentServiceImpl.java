package project.service.impl;

import project.entity.Payment;
import project.dao.PaymentDao;
import project.service.PaymentService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Payment)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 15:03:24
 */
@Service
public class PaymentServiceImpl implements PaymentService {
     @Resource
    private PaymentDao paymentDao;

   
}
