package com.example.service;

import com.example.entity.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AccountServiceTests {

    @Autowired
    private AccountService accountService ;
    @Test
    public void reg(){

        Account account = new Account();
        account.setUsername("zhangsan");
        account.setPassword("123");


        accountService.reg(account);

    }

}
