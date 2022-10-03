package com.example.gatewaydy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;

import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableHystrix
public class GatewayDyApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayDyApplication.class, args);
    }

    @Bean
    DiscoveryClientRouteDefinitionLocator dynamicRoutes(DiscoveryLocatorProperties dlp, ReactiveDiscoveryClient rdc){
        return new  DiscoveryClientRouteDefinitionLocator(rdc,dlp);
    }

}
