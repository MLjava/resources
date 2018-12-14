package com.repository;

import com.dataobject.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author：linma
 * @date: 2018/11/21 14:45
 * @email: linma@homeinns.com
 **/
public interface ISalesRepository extends JpaRepository<Sales, String> {

    /**
     * 根据产品信息查询销售人员
     *
     * @param productId
     * @return
     */
    List<Sales> findSalesByProductId(String productId);

}
