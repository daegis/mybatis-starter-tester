package com.hnair.spring.boot.mybatisstartertester.web;


import com.hnair.spring.boot.mybatis.component.service.ICommonService;
import com.hnair.spring.boot.mybatisstartertester.model.ActivityInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 9/10/2018 2:48 PM
 */
@Controller
public class TestController {

    @Autowired
    private ICommonService masterCommonService;

    @RequestMapping("/test")
    @ResponseBody
    public Object test() {
        final List<Object> list = masterCommonService.getList(ActivityInfo.class);
        return list;
    }
}
