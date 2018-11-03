package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author：linma
 * @date: 2018/11/3 9:47
 * @email: linma@homeinns.com
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableResourceServer
public class ResourcesApplications {

    public static void main(String[] args) {
        SpringApplication.run(ResourcesApplications.class, args);
    }
}
