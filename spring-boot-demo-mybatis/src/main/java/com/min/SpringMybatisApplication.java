package com.min;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.min.dao")
public class SpringMybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisApplication.class,args);
    }
}
