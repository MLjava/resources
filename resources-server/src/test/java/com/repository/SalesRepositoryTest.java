package com.repository;

import com.ResourcesApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author：linma
 * @date: 2018/11/3 14:13
 * @email: linma@homeinns.com
 **/
public class SalesRepositoryTest extends ResourcesApplicationTests {

    @Autowired
    private SalesRepository salesRepository;

    @Test
    public void findSalesById() {
        System.out.println(salesRepository.findSalesById("201811030ABTURB"));
    }
}