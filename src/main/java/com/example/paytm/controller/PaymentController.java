package com.example.paytm.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paytmService")
public class PaymentController {

    @GetMapping("/payment")
    public String doPayment(){
        return "Paytm Service is Send";
    }
}
