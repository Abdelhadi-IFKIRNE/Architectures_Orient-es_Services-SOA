package com.example.securityservice.Conf;

import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.source.ImmutableJWKSet;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.SecurityContext;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@EnableWebSecurity
@Configuration
@AllArgsConstructor
public class SecurityConf {
    private getPubAndPrivKeys getPubAndPrivKeys;
    private PasswordEncoder passwordEncoder;

    @Bean
    public AuthenticationManager authenticationManager(UserDetailsService userDetailsService){
        var daoAuth=new DaoAuthenticationProvider();
        daoAuth.setPasswordEncoder(passwordEncoder);
        daoAuth.setUserDetailsService(userDetailsService);
        return new ProviderManager(daoAuth);
    }

    @Bean
    public UserDetailsService inMemoryUserDetailsManager(){
        return new InMemoryUserDetailsManager(
                User.withUsername("abdelhadi").password(passwordEncoder.encode("1234")).authorities("USER","ADMIN").build(),
                User.withUsername("abderrahim").password(passwordEncoder.encode("1234")).authorities("USER","ADMIN").build(),
                User.withUsername("moustapha").password(passwordEncoder.encode("1234")).authorities("USER","ADMIN").build(),
                User.withUsername("zakaria").password(passwordEncoder.encode("1234")).authorities("USER","ADMIN").build(),
                User.withUsername("imrane").password(passwordEncoder.encode("1234")).authorities("USER","ADMIN").build()
        );
    }

    @Bean
    public SecurityFilterChain DoSecurity(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .authorizeHttpRequests(auth->auth.requestMatchers("/token/**").permitAll())
                .authorizeHttpRequests(auth-> auth.anyRequest().authenticated())
                .csrf(csrf->csrf.disable())
                .sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt)
                .httpBasic(Customizer.withDefaults())
                .build();
    }

    @Bean
    JwtDecoder decoder(){
        return NimbusJwtDecoder.withPublicKey(getPubAndPrivKeys.publicKey()).build();
    }
    @Bean
    public JwtEncoder encoder(){
        JWK jwk=new RSAKey.Builder(getPubAndPrivKeys.publicKey()).privateKey(getPubAndPrivKeys.privateKey()).build();
        JWKSource<SecurityContext> jwkSource=new ImmutableJWKSet<>(new JWKSet(jwk));
        return new NimbusJwtEncoder(jwkSource);
    }


}
