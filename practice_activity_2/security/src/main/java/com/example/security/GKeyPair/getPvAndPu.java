package com.example.security.GKeyPair;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@ConfigurationProperties("rsa")
public record getPvAndPu(RSAPrivateKey privateKey, RSAPublicKey publicKey) {
}
