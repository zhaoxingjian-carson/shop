package com.carson.weixin.service.impl;

import com.carson.entity.weixin.AppEntity;
import com.carson.service.weixin.AppService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoxingjian
 * @description: TODO
 * @date 2019/11/7 19:27
 */
@RestController
public class AppServiceImpl implements AppService {
    @Override
    public AppEntity getApp() {
        return new AppEntity("weixin","appsecret");
    }
}
