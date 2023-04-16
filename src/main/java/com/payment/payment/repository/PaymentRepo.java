package com.payment.payment.repository;

import com.payment.payment.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Customer,String> {


}
