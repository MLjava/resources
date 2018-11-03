package com.enums;

import lombok.Getter;

/**
 * @author：linma
 * @date: 2018/11/3 10:07
 * @email: linma@homeinns.com
 **/
@Getter
public enum CommonEnums {

    ;

    private Integer code;

    private String message;

    CommonEnums(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
