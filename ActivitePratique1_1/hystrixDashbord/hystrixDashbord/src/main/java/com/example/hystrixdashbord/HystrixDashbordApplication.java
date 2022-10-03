package com.example.hystrixdashbord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
public class HystrixDashbordApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashbordApplication.class, args);
    }

}
