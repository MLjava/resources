package com.controller;

import com.utils.ResultUtils;
import com.utils.ResultVO;
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

    @GetMapping("/congratulations")
    public ResultVO congratulations() {
        return ResultUtils.success("恭喜你工程师，顺利完成测试！");
    }

}
