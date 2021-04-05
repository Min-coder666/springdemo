package com.min;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@ServletComponentScan(basePackages = "com.min.filter")
public class SpringBootFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFilterApplication.class,args);
    }
}
