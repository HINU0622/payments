package com.toss.payments.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/payments")
public class WebController {

    @GetMapping("/success")
    public String success() {
        return "/success1";
    }

    @GetMapping("/payments")
    public String payments() {
        return "/payments/payments";
    }

    @GetMapping("/fail")
    public String fail() {
        return "/fail1";
    }

}
