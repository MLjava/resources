package com.enums;

import com.constant.CommonConstant;
import lombok.Getter;

/**
 * @author：linma
 * @date: 2018/12/14 9:39
 * @email: linma@homeinns.com
 **/
@Getter
public enum OAuth2Enums {

    /**
     * 访问资源失败
     */
    AUTHORIZATION_ERROR(CommonConstant.AUTHORIZATION_FAILURE,
            CommonConstant.Message.AUTHORIZATION_FAILURE_MESSAGE),

    ACCESS_TOKEN_NOT_MATCH(CommonConstant.AUTHORIZATION_FAILURE, "AcessToken不匹配！");

    private Integer code;

    private String message;

    OAuth2Enums(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
