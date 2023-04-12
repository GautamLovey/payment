package com.payment.payment.feign;

import com.payment.payment.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "Customer-api",url="localhost:8051/api")
public interface PaymentClient {
    @PostMapping(value = "/enter")
    String enterTheCustomer(@RequestBody Customer customer);

    @GetMapping(value = "/fetch/{accountNumber}")
    Customer getTheCustomer(@PathVariable("accountNumber") String accountNumber);
}
