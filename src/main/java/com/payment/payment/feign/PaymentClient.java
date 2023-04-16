package com.payment.payment.feign;

import com.payment.payment.model.AccBalResponseCentral;
import com.payment.payment.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "Customer-api",url="localhost:8051/api")
public interface PaymentClient {

    @GetMapping(value = "/fetch/{propertyCentral}")
    AccBalResponseCentral getTheCustomer(@PathVariable("propertyCentral") String propertyCentral);
}


