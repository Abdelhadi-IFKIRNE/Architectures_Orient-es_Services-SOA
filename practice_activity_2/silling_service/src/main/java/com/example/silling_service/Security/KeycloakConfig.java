package com.example.silling_service.Security;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.cloud.openfeign.security.OAuth2FeignRequestInterceptorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeycloakConfig {
    @Bean
    KeycloakSpringBootConfigResolver keycloakSpringBootConfigResolver(){
        return new KeycloakSpringBootConfigResolver();
    }
}
