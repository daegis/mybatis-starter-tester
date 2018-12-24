package com.hnair.spring.boot.mybatisstartertester.service.impl;

import com.hnair.spring.boot.mybatis.component.service.ICommonService;
import com.hnair.spring.boot.mybatisstartertester.model.ActivityInfo;
import com.hnair.spring.boot.mybatisstartertester.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 9/10/2018 8:49 PM
 */
@Service
@Slf4j
public class TestServiceImpl implements TestService {

    @Autowired
    private ICommonService commonService;

    @Transactional
    @Override
    public void save() throws Exception {
        final ActivityInfo info = new ActivityInfo();
        info.setActivityName("aaa");
        commonService.save(info);
        int i = 1 / 0;
        final ActivityInfo bbb = new ActivityInfo();
        bbb.setActivityName("bbb");
        commonService.save(bbb);
    }
}
