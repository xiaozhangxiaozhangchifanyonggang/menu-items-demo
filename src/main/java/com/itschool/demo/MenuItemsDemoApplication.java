package com.itschool.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.itschool.demo.mapper")
public class MenuItemsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenuItemsDemoApplication.class, args);
    }

}
