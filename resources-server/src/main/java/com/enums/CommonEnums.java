package com.enums;

import lombok.Getter;

/**
 * @author：linma
 * @date: 2018/11/3 10:07
 * @email: linma@homeinns.com
 **/
@Getter
public enum CommonEnums {

    /**
     * 统一错误
     */
    NOT_KNOW_EXCEPTION(500, "糟糕了，服务器出现错误了！");;

    private Integer code;

    private String message;

    CommonEnums(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
