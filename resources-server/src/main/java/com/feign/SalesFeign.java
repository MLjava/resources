package com.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author：linma
 * @date: 2018/11/21 15:05
 * @email: linma@homeinns.com
 **/
@FeignClient(value = "resources")
@Component
public interface SalesFeign {

    /**
     *费事
     *
     * @return
     */
    @GetMapping("/homeinns/feign")
    String test();

}
