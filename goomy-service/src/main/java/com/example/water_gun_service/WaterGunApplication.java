package com.example.water_gun_service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WaterGunApplication {
    private static final Logger log = LogManager.getLogger(WaterGunApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WaterGunApplication.class, args);
    }
}
