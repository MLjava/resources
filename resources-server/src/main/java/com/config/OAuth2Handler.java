package com.config;

import com.enums.OAuth2Enums;
import com.exception.OAuth2Exception;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.utils.ResultUtils;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author：linma
 * @date: 2018/12/14 9:35
 * @email: linma@homeinns.com
 **/
@Component
public class OAuth2Handler implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request,
                       HttpServletResponse response, AccessDeniedException e)
            throws IOException, ServletException {
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        ObjectMapper objectMapper = new ObjectMapper();
        response.getWriter().
                write(objectMapper.
                        writeValueAsString(ResultUtils.
                                failure(new OAuth2Exception(OAuth2Enums.AUTHORIZATION_ERROR))));
    }
}
