package com.carson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhaoxingjian
 * @description: TODO
 * @date 2019/11/7 19:56
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableSwagger2Doc
//@EnableApolloConfig
public class WeixinAppServer {
    public static void main(String[] args) {
        SpringApplication.run(WeixinAppServer.class, args);
    }
}
