package com.example.security.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RestControllerDataTest {

    @GetMapping("/test")
    public Map<String,Object> getData(){
        return Map.of("Message","this is a testing data ");
    }

}
