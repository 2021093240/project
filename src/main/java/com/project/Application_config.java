package com.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.project.mapper")
public class Application_config {

    public static void main(String[] args) {
        SpringApplication.run(Application_config.class, args);
    }

}
