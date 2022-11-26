package com.example.securityservice.Conf;

import org.springframework.boot.context.properties.ConfigurationProperties;


import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@ConfigurationProperties("rsa")
public record getPubAndPrivKeys(RSAPublicKey publicKey, RSAPrivateKey privateKey) {
}
