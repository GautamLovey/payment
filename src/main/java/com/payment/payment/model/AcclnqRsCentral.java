package com.payment.payment.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
@Data
public class AcclnqRsCentral {
    String accountShortNameCentral;
    Date accountOpenDateCentral;
    String dispatchModeCentral;
    String schemeTypeCentral;
    String schemeCodeCentral;
    Integer totalIntAmtCentral;
    String customerIdCentral;
    Integer depositTermMonthCentral;
    Integer maturityAmtCentral;
    String interestCreditAccIdCentral;
    String totalIntAmtCrncyCodeCentral;
    Integer depositTerDaysCentral;
    String modeOfOperCodeDescCentral;
    String accountClosureFlgCentral;
    Integer APVvalueCentral;
    String maturityAmtCrncyCodeCentral;
    String accFreezeStatusCentral;
    ArrayList<AccBalCentral> accBalCentrals;




}
