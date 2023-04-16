package com.payment.payment.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class AcctInqRs {
    String accountShortName;
    Date accountOpenDate;
    String dispatchMode;
    String schemeType;
    String schemeCode;
    Integer totalIntAmt;
    String customerId;
    Integer depositTermMonth;
    Integer maturityAmt;
    String interestCreditAccId;
    String totalIntAmtCrncyCode;
    Integer depositTerDays;
    String modeOfOperCodeDesc;
    String accountClosureFlg;
    Integer APVvalue;
    String maturityAmtCrncyCode;
    String accFreezeStatus;
    List<AccBal> accBalList ;



}
