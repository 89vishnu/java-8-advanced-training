package com.school.models.dto;

import lombok.Data;

@Data
public class LoginTokenDto {

    private String accessToken;
    private String refreshToken;
    private String userName;
    private Long userId;
    private String emailId;

}
