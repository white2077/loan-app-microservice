package com.white.bank.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "customer-service", url = "http://localhost:8081")
public interface CustomerClient {
    @GetMapping("/customer/{cif}")
    boolean checkExist(@PathVariable String cif);
}
