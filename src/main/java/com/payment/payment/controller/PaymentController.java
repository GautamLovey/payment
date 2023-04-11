package com.payment.payment.controller;

import com.payment.payment.feign.PaymentClient;
import com.payment.payment.model.Customer;
import com.payment.payment.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    PaymentClient paymentClient;
    @Autowired
    PaymentRepo paymentRepo;
    @GetMapping("/details/{accountNUmber}")
    Customer getCustomerDetails(@PathVariable String accountNUmber){
        paymentRepo.saveAndFlush(paymentClient.getTheCustomer(accountNUmber));
        return paymentClient.getTheCustomer(accountNUmber);
    }
    @PostMapping("/register")
    String postTheCustomer(@RequestBody Customer customer){
        return paymentClient.enterTheCustomer(customer);
    }
}
