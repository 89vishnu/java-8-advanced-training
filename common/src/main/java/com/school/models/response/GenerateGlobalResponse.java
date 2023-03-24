package com.school.models.response;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class GenerateGlobalResponse {

    public GlobalResponse generateGlobalResponse(Object response,
                                                 String responseIncator,
                                                 String statusCode,
                                                 String message) {
        GlobalResponse globalResponse = new GlobalResponse();
        globalResponse.setResponse(response);
        globalResponse.setResponseIndicator(responseIncator);
        globalResponse.setStatusCode(statusCode);
        globalResponse.setResponseMessage(message);
        return globalResponse;
    }
}
