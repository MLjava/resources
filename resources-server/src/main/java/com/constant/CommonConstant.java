package com.constant;

/**
 * @author：linma
 * @date: 2018/11/3 10:09
 * @email: linma@homeinns.com
 **/
public interface CommonConstant {

    /**
     * 请求成功
     */
    Integer REQUEST_OK = 200;

    Integer AUTHORIZATION_FAILURE = 401;

    interface Message {

        String REQUEST_OK_MESSAGE = "请求成功";

        String AUTHORIZATION_FAILURE_MESSAGE = "没有权限访问";
    }
}
