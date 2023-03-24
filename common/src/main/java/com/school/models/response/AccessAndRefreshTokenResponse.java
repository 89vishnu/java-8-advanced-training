package com.school.models.response;

import lombok.Data;

@Data
public class AccessAndRefreshTokenResponse {
    private String accessToken;
    private String refreshToken;
}
