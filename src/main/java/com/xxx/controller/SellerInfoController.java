package com.xxx.controller;

import com.xxx.service.SellerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @program: springboo2-mybatis-demo
 * @description: UserController
 * @author: JackDong.ch
 * @create: 2018-05-24 14:49
 **/
@Controller
@RequestMapping(value = "/seller")
public class SellerInfoController {

    @Autowired
    private SellerInfoService sellerInfoService;

    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){
        return sellerInfoService.findAllSellerInfo(pageNum,pageSize);
    }
}
