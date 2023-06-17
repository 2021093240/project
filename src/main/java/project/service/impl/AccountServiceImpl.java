package project.service.impl;

import project.entity.Account;
import project.dao.AccountDao;
import project.service.AccountService;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * (Account)表服务实现类
 *
 * @author makejava
 * @since 2023-06-17 15:03:23
 */
@Service
public class AccountServiceImpl implements AccountService {
     @Resource
    private AccountDao accountDao;

   
}
