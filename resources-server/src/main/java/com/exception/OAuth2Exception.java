package com.exception;

import com.enums.CommonEnums;
import com.enums.OAuth2Enums;
import lombok.Getter;

/**
 * @author：linma
 * @date: 2018/12/14 9:36
 * @email: linma@homeinns.com
 **/
@Getter
public class OAuth2Exception extends HomeinnsException {

    public OAuth2Exception(OAuth2Enums oAuth2Enums) {
        super(oAuth2Enums.getCode(), oAuth2Enums.getMessage());
    }
}
