package com.services;

import com.ResourcesApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author：linma
 * @date: 2018/11/21 14:55
 * @email: linma@homeinns.com
 **/
public class ISalesServiceTest extends ResourcesApplicationTests {

    @Autowired
    private ISalesService salesService;

    @Test
    public void getSalesByProductId() {
        System.out.println(salesService.getSalesByProductId("1"));
    }
}