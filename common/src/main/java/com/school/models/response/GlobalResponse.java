package com.school.models.response;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class GlobalResponse {
    private Object response = new Object();
    private String responseIndicator;
    private String statusCode;
    private String responseMessage;

//    public GlobalResponse (Object response, String responseIndicator,
//                           String statusCode, String responseMessage) {
//        this.response = response;
//        this.responseIndicator = responseIndicator;
//        this.statusCode = statusCode;
//        this.responseMessage = responseMessage;
//    }
}
