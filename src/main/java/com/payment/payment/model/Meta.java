package com.payment.payment.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Meta {
    String requestUid;
    String globalUid;
    String contextUrl;
    List<ErrorDetails> errorDetails;

}
