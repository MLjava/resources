package com.controller;

import com.services.ISalesService;
import com.utils.ResultUtils;
import com.utils.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：linma
 * @date: 2018/11/3 10:10
 * @email: linma@homeinns.com
 **/
@RestController
@RequestMapping("/homeinns")
public class ResourceController {

    @Autowired
    private ISalesService salesService;

    @GetMapping("/congratulations")
    public ResultVO congratulations() {
        return ResultUtils.success("恭喜你工程师，顺利完成测试！");
    }

    @GetMapping("listsalesbyproductid")
    public ResultVO getSalesByProductId(String productId) {
        return ResultUtils.success(salesService.getSalesByProductId(productId));
    }

    @GetMapping("/feign")
    public String feign() {
        return "恭喜，测试fegin成功！";
    }

}
