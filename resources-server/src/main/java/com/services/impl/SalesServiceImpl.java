package com.services.impl;

import com.dataobject.Sales;
import com.repository.ISalesRepository;
import com.services.ISalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author：linma
 * @date: 2018/11/21 14:51
 * @email: linma@homeinns.com
 **/
@Service
public class SalesServiceImpl implements ISalesService {

    @Autowired
    private ISalesRepository salesRepository;

    @Override
    public List<Sales> getSalesByProductId(String productId) {
        if (!StringUtils.isEmpty(productId)) {
            return salesRepository.findSalesByProductId(productId);
        }
        return null;
    }
}
