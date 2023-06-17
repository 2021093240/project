package project.controller;

import project.entity.Account;
import project.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Account)表控制层
 *
 * @author makejava
 * @since 2023-06-17 15:03:22
 */
@RestController
@RequestMapping("account")
public class AccountController {
  
    @Resource
    private AccountService accountService;

   
}

