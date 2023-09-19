package com.toss.payments.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class PaymentController {

    @PostMapping("/payments/paymentinfo")
    public ResponseEntity<Object> paymentInfo(@RequestBody Object o) {
        log.info("Payments {}", o);
        return ResponseEntity.ok(o);
    }

}
