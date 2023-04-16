package com.payment.payment.model;

import lombok.Data;

@Data
public class AccBal {
    String balanceType;
    Integer balanceAmount;
    String currencyCode;
    String creditDebitInd;
}
