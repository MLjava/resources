package com.config;

import com.enums.CommonEnums;
import com.exception.HomeinnsException;
import com.utils.ResultUtils;
import com.utils.ResultVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：linma
 * @date: 2018/11/3 13:31
 * @email: linma@homeinns.com
 **/
@RestController
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResultVO homeExceptionHandler(RuntimeException e) {
        if (e instanceof HomeinnsException) {
            HomeinnsException homeinnsException = (HomeinnsException) e;
            return ResultUtils.failure(homeinnsException);
        }
        return ResultUtils.failure(new HomeinnsException(CommonEnums.NOT_KNOW_EXCEPTION));
    }

}
