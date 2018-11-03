package com.utils;

import lombok.Data;

/**
 * @author：linma
 * @date: 2018/11/3 10:04
 * @email: linma@homeinns.com
 **/
@Data
public class ResultVO<T> {

    private Integer code;

    private String message;

    private T data;
}
