package com.example.springbootbic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Description: 测试
 * @Author: CZJ
 * @Date: 2022/6/6
 */
@RequestMapping("test")
@RestController
public class TestController {

    /**
     * 测试接口
     * @return     信息
     */
    @RequestMapping(value = "test", method = {RequestMethod.GET, RequestMethod.POST})
    private String test() {
        return "test success!";
    }

}
