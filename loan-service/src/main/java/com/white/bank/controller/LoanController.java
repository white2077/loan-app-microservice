package com.white.bank.controller;

import com.white.bank.integration.CustomerClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/loans")
@RequiredArgsConstructor
public class LoanController {
    private final CustomerClient customerClient;

    @GetMapping("/{cif}")
    public Map<String, Object> getLoanBasicInfo(@PathVariable String cif) {
        return customerClient.checkExist(cif) ? Map.of("cif", cif, "loanAmount", 10000) : Map.of("error", "Customer not found");
    }
}