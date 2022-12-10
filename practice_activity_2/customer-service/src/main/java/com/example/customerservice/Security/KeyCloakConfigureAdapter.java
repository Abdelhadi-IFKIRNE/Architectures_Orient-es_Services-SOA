package com.example.customerservice.Security;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeyCloakConfigureAdapter {
    @Bean
    KeycloakSpringBootConfigResolver keycloakAdapter(){
        return new KeycloakSpringBootConfigResolver();
    }
}
