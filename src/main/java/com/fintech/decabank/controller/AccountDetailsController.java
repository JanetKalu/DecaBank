package com.fintech.decabank.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("api/v1/DecaBank")
@RequiredArgsConstructor
public class AccountDetailsController {

    @GetMapping("/myAccount")
    public String accountDetails() {
        return "Account Details: ";
    }
}
