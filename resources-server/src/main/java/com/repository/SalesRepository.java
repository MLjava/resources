package com.repository;

import com.pojo.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author：linma
 * @date: 2018/11/3 14:10
 * @email: linma@homeinns.com
 **/
public interface SalesRepository extends JpaRepository<Sales, String> {

    /**
     * 根据id查询销售人员信息
     *
     * @param id
     * @return
     */
    Sales findSalesById(String id);

}
