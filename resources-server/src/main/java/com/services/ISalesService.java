package com.services;

import com.dataobject.Sales;

import java.util.List;

/**
 * @author：linma
 * @date: 2018/11/21 14:50
 * @email: linma@homeinns.com
 **/
public interface ISalesService {

    /**
     * 根据产品id获取销售人员信息
     *
     * @param productId
     * @return
     */
    List<Sales> getSalesByProductId(String productId);

}
