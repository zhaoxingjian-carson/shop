package com.carson.service.weixin;

import com.carson.entity.weixin.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

@Api(tags = "微信服务接口")
public interface AppService {

    /**
     * 获取app应用信息
     *
     * @return
     */
    @ApiOperation("获取微信app")
    @GetMapping("/getApp")
    public AppEntity getApp();

}
