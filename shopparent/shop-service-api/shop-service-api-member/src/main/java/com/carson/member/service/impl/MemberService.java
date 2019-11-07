package com.carson.member.service.impl;

import com.carson.entity.weixin.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhaoxingjian
 * @description: TODO
 * @date 2019/11/7 20:14
 */
public interface MemberService {
    @GetMapping("memberToWeixin")
    AppEntity memberToWeixin();
}
