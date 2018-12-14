package com.config;

import com.enums.OAuth2Enums;
import com.exception.OAuth2Exception;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author：linma
 * @date: 2018/12/14 9:51
 * @email: linma@homeinns.com
 **/
@Component
public class OAuth2EntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException e) throws IOException, ServletException {
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        ObjectMapper objectMapper = new ObjectMapper();
        response.getWriter()
                .write(objectMapper.
                        writeValueAsString(new OAuth2Exception(OAuth2Enums.ACCESS_TOKEN_NOT_MATCH)));
    }
}
