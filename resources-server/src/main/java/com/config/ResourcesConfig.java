package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * @author：linma
 * @date: 2018/11/21 15:28
 * @email: linma@homeinns.com
 **/
@Configuration
public class ResourcesConfig implements ResourceServerConfigurer {

    @Override
    public void configure(ResourceServerSecurityConfigurer resources)
            throws Exception {

    }

    @Override
    public void configure(HttpSecurity http) throws Exception {

    }
}
