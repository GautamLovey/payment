package com.payment.payment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Data
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    String accountNumber;
    String firstName;
    String lastName;
    String dob;
    String gender;
    String address;
    Integer phoneNumber;
    String emailId;



}

