package com.fintech.decabank.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
//@RequestMapping("api/v1/DecaBank")
public class LoanController {

        @GetMapping("/myLoanRecord")
        public String getLoanRecord() {
            return "My Loan Record is as follows: ";
        }
}
