package com.example.silling_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class SillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SillingServiceApplication.class, args);
    }

}
