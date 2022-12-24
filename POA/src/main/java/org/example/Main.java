package org.example;

import org.example.service.metier;
import org.example.service.metierImpl;
import org.example.service.securityContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = {"org.example"})
public class Main {
    public static void main(String[] args) {
        securityContext.authenticate("abdelhadi","1234",new String[]{"ADMIN","USER"});
        metier metier=new metierImpl();
        System.out.println(metier.getInformation("abdelhadi",16));
    }
}