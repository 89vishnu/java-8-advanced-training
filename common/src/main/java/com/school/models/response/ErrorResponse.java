package com.school.models.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {
    private Object response = new Object();
    private String responseIndicator;
    private String statusCode;
    private String responseMessage;
}
