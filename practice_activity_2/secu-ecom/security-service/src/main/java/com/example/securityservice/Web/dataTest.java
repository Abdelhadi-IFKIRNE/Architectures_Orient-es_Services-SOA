package com.example.securityservice.Web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class dataTest {

    @GetMapping("/dataTest")
    public Map<String,Object> getDataTest(){
        return Map.of("Message","this is a data test message");
    }
}
