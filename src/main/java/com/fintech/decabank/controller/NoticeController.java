package com.fintech.decabank.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("api/v1/DecaBank")
@RequiredArgsConstructor

public class NoticeController {

    @GetMapping("/notices")
    public String getNotice() {
        return "No Notice update: ";
    }

}

