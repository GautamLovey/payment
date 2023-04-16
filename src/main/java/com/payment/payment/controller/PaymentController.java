package com.payment.payment.controller;

import com.payment.payment.feign.PaymentClient;
import com.payment.payment.mapping.ResponseTransform;
import com.payment.payment.model.AccBalResponse;
import com.payment.payment.model.AccBalResponseCentral;
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
    @Autowired
    ResponseTransform responseTransform;

    @GetMapping("/{propertyCentral}")
    AccBalResponse getTheResponse(@PathVariable String propertyCentral ){
        AccBalResponseCentral accBalResponseCentral=paymentClient.getTheCustomer(propertyCentral);
        return responseTransform.CentralToClient(accBalResponseCentral);
    }

}
