package com.repository;

import com.ResourcesApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author：linma
 * @date: 2018/11/21 14:46
 * @email: linma@homeinns.com
 **/
public class ISalesRepositoryTest extends ResourcesApplicationTests {

    @Autowired
    private ISalesRepository ISalesRepository;

    @Test
    public void findAll() {
        System.out.println(ISalesRepository.findAll());
    }

    @Test
    public void findById() {
        System.out.println(ISalesRepository.findById("1"));
    }

}