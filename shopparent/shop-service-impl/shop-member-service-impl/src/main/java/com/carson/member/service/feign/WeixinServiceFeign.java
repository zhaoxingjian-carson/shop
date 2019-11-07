package com.carson.member.service.feign;

import com.carson.entity.weixin.AppEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhaoxingjian
 * @description: TODO
 * @date 2019/11/7 20:18
 */


@FeignClient("app-carson-weixin")
public interface WeixinServiceFeign {

    /**
     * 获取app应用信息
     *
     * @return
     */
    @GetMapping("/getApp")
    public AppEntity getApp();
}
