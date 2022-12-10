package com.example.securityservice.Web;

import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.jwt.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class SecurityRestController {
    private JwtEncoder jwtEncoder;
    private AuthenticationManager authenticationManager;
    private JwtDecoder jwtDecoder;
    private UserDetailsService userDetailsService;

    @PostMapping("/token")
    public Map<String,String> getToken(String username,String password,boolean withRefreshToken,String granType, String refreshToken){
        String subject=null;
        String scope=null;
        if(granType.equals("password")){
            Authentication authentication=authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(username,password)
            );
            subject= authentication.getName();
            scope=authentication.getAuthorities().stream().map(auth->auth.getAuthority()).collect(Collectors.joining( " "));
        }else if(granType.equals("refreshToken")){
            Jwt decodedJwt = jwtDecoder.decode(refreshToken);
            subject= decodedJwt.getSubject();
            UserDetails userDetails = userDetailsService.loadUserByUsername(subject);
            scope= userDetails.getAuthorities().stream().map(grantedAuthority -> grantedAuthority.getAuthority()).collect(Collectors.joining(" "));
        }

        Map<String,String> idToken=new HashMap<>();
        Instant instant=Instant.now();
        JwtClaimsSet jwtClaimsSet=JwtClaimsSet.builder()
                .subject(subject)
                .issuedAt(instant)
                .expiresAt(instant.plus(withRefreshToken?1:5,ChronoUnit.MINUTES))
                .issuer("security-service")
                .claim("scope",scope)
                .build();
        String accessToken=jwtEncoder.encode(JwtEncoderParameters.from(jwtClaimsSet)).getTokenValue();
        idToken.put("accessToken",accessToken);
        if(withRefreshToken){
            JwtClaimsSet jwtClaimsSet1=JwtClaimsSet.builder()
                    .subject(subject)
                    .issuedAt(instant)
                    .expiresAt(instant.plus(5,ChronoUnit.MINUTES))
                    .issuer("security-service")
                    .build();
            String refreshToken1 =jwtEncoder.encode(JwtEncoderParameters.from(jwtClaimsSet1)).getTokenValue();
            idToken.put("refreshToken",refreshToken1);
        }
        return idToken;
    }
}
