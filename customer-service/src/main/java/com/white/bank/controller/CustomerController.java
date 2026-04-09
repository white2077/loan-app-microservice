package com.white.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
class CustomerController {

    @GetMapping("/{cif}")
    public boolean checkExist(@PathVariable String cif) {
        return cif.equals("123456789");
    }
}
