package com.example.springaop;

import com.example.springaop.service.Imetier;
import com.example.springaop.service.ImetierImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
		ImetierImpl imetier=new ImetierImpl();
		System.out.println(imetier.getInformation());
	}


}
