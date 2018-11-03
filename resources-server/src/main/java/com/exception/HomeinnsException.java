package com.exception;

import com.enums.CommonEnums;
import lombok.Getter;

/**
 * @author：linma
 * @date: 2018/11/3 10:06
 * @email: linma@homeinns.com
 **/
@Getter
public class HomeinnsException extends RuntimeException {

    private Integer code;

    public HomeinnsException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public HomeinnsException(CommonEnums commonEnums) {
        this(commonEnums.getCode(), commonEnums.getMessage());
    }

}
