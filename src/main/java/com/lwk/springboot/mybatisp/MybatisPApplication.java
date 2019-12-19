package com.lwk.springboot.mybatisp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.lwk.springboot.mybatisp.mapper")
//@MapperScan(basePackages = {"com.lwk.springboot.mybatisp.mapper"})
public class MybatisPApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPApplication.class, args);
    }

}
