package com.carson.member.service.feign;

import com.carson.service.weixin.AppService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author zhaoxingjian
 * @description: TODO
 * @date 2019/11/7 20:18
 */


@FeignClient("app-carson-weixin")
public interface WeixinServiceFeign extends AppService {


}
