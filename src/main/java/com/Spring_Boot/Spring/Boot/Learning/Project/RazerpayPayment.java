package com.Spring_Boot.Spring.Boot.Learning.Project;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provide" , havingValue = "razerpay")
public class RazerpayPayment implements  PaymentService {
     public String pay(){
        String payment = "RazerPay Payment";
        System.out.println(payment);
        return payment;

    }
}
