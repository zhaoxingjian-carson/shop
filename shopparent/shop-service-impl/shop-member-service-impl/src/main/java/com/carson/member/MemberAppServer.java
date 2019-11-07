package com.carson.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.swing.*;

/**
 * @author zhaoxingjian
 * @description: TODO
 * @date 2019/11/7 20:46
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MemberAppServer {
    public static void main(String[] args) {
        SpringApplication.run(MemberAppServer.class, args);
    }

}
