package com.example.silling_service.OpenFeignServices;

import com.example.silling_service.Security.InterceptorFeign;
import com.example.silling_service.entities.Customer;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "customer-service",configuration = {InterceptorFeign.class})
public interface CustomerOpenFeignService {
    @GetMapping("/customers/{id}")
    public Customer getCustomerId(@PathVariable(name = "id") String idCustomer);
}
