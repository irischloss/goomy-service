package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mapper")
public class ApplicationLoader {
    private static final Logger log = LogManager.getLogger(ApplicationLoader.class);

    public static void main(String[] args) {
        SpringApplication.run(ApplicationLoader.class, args);
    }
}
