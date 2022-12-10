package com.example.silling_service;

import feign.RequestInterceptor;
import org.keycloak.adapters.springsecurity.client.KeycloakClientRequestFactory;
import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTrace;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;

import java.security.Principal;

@SpringBootApplication
@EnableFeignClients
public class SillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SillingServiceApplication.class, args);
    }

    @Bean
    KeycloakRestTemplate keycloakRestTemplate(KeycloakClientRequestFactory keycloakClientRequestFactory){
        return new KeycloakRestTemplate(keycloakClientRequestFactory);
    }

}
