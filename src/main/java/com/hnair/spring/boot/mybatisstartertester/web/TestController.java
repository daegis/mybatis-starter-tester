package com.hnair.spring.boot.mybatisstartertester.web;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 9/10/2018 2:48 PM
 */
@Controller
public class TestController {

    @Resource
    private Map<String, Object> mybatisMap;

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return JSON.toJSONString(mybatisMap);
    }
}
