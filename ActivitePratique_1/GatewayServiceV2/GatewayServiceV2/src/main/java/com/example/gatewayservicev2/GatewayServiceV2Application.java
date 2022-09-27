package com.example.gatewayservicev2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayServiceV2Application {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceV2Application.class, args);
    }

    @Bean
    RouteLocator gateWay(RouteLocatorBuilder builder){
        return builder.routes()
                .route(r->r.path("/customers/**").uri("http://localhost:8080/"))
                .route(r2->r2.path("/products/**").uri("http://localhost:8686/"))
                .build();
    }

}
