package com.payment.payment.mapping;

import com.payment.payment.model.*;

import java.util.ArrayList;
import java.util.List;

public class ResponseTransform {
   public AccBalResponse CentralToClient(AccBalResponseCentral accBalResponseCentral){
        AccBalResponse accBalResponse = new AccBalResponse();
        if(accBalResponseCentral.getPropertyCentral()!=null){
            accBalResponse.setProperty(accBalResponse.getProperty());
        }
        if(accBalResponseCentral.getMeta()!=null){
            accBalResponse.setMeta(accBalResponseCentral.getMeta());
        }
        if(accBalResponseCentral.getDataCentral()!=null){
            DataCentral dataCentral = accBalResponseCentral.getDataCentral();
            Data data = new Data();
            if(dataCentral.getAcclnqRsCentral()!=null){
                AcclnqRsCentral acclnqRsCentral = dataCentral.getAcclnqRsCentral();
                AcctInqRs acctInqRs = new AcctInqRs();
                acctInqRs.setAPVvalue(acclnqRsCentral.getAPVvalueCentral());
                acctInqRs.setAccFreezeStatus(acclnqRsCentral.getAccFreezeStatusCentral());
                acctInqRs.setAccountClosureFlg(acclnqRsCentral.getAccountClosureFlgCentral());
                acctInqRs.setAccountOpenDate(acclnqRsCentral.getAccountOpenDateCentral());
                acctInqRs.setAccFreezeStatus(acclnqRsCentral.getAccFreezeStatusCentral());
                acctInqRs.setAccountShortName(acclnqRsCentral.getAccountShortNameCentral());
                acctInqRs.setDepositTermMonth(acclnqRsCentral.getDepositTermMonthCentral());
                acctInqRs.setInterestCreditAccId(acclnqRsCentral.getInterestCreditAccIdCentral());
                acctInqRs.setSchemeCode(acclnqRsCentral.getSchemeCodeCentral());
                List<AccBal> accBalList  = new ArrayList<>();
                for(AccBalCentral accBalCentral : acclnqRsCentral.getAccBalCentrals()){
                    AccBal accBal = new AccBal();
                    accBal.setBalanceAmount(accBalCentral.getBalanceAmountCentral());
                    accBal.setBalanceType(accBalCentral.getBalanceTypeCentral());
                    accBal.setCreditDebitInd(accBalCentral.getCreditDebitIndCentral());
                    accBal.setCurrencyCode(accBalCentral.getCurrencyCodeCentral());
                    accBalList.add(accBal);
                }
                acctInqRs.setAccBalList(accBalList);
                data.setAcctInqRs(acctInqRs);
            }
            accBalResponse.setData(data);
        }
        return  accBalResponse;

    }

}


