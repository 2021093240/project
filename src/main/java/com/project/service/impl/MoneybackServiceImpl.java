package com.project.service.impl;

import com.project.entity.Moneyback;
import com.project.dao.MoneybackDao;
import com.project.service.MoneybackService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Moneyback)表服务实现类
 *
 * @author makejava
 * @since 2023-06-15 21:17:37
 */
@Service
public class MoneybackServiceImpl implements MoneybackService {
     @Resource
    private MoneybackDao moneybackDao;

   
}
