package com.carson.member.service.impl;

import com.carson.entity.weixin.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhaoxingjian
 * @description: TODO
 * @date 2019/11/7 20:14
 */
@Api(tags = "会员服务")
public interface MemberService {

    @ApiOperation("调用微信服务")
    @GetMapping("memberToWeixin")
    AppEntity memberToWeixin();
}
