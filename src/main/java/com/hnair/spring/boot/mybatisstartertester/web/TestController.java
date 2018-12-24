package com.hnair.spring.boot.mybatisstartertester.web;

import com.guazi.spring.boot.mybatis.component.service.ICommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 9/10/2018 2:48 PM
 */
@Controller
public class TestController {

    @Autowired
    private ICommonService commonService;

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        System.out.println(commonService);
        return commonService.toString();
    }
}
