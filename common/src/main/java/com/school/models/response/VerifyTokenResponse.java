package com.school.models.response;

import com.school.models.dto.token.TokenStructure;
import lombok.Data;

@Data
public class VerifyTokenResponse {

    private TokenStructure accessTokenStructure;
    private TokenStructure refereshTokenStructure;

}
