package com.carson.member.service.impl;

import com.carson.entity.weixin.AppEntity;
import com.carson.member.service.feign.WeixinServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoxingjian
 * @description: TODO
 * @date 2019/11/7 20:18
 */

@RestController
public class MemberServiceImpl implements MemberService {

    @Autowired
    private WeixinServiceFeign weixinServiceFeign;

    @Override
    public AppEntity memberToWeixin() {
        return weixinServiceFeign.getApp();
    }
}
