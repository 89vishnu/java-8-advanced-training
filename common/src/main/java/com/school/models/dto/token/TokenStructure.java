package com.school.models.dto.token;

import lombok.Data;

@Data
public class TokenStructure {
    private String userEmailId;
    private String password;
    private Long tokenGeneratedDateAndTime;
    private String refreshTokenIndicator;
    private Long tokenExpiredInDateAndTime;
}
