package com.huyanqiu.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 此项目的核心初始化类
 * @author huyanqiu
 * @date 2018年2月7日下午4:14:54
 * @version 版本号：1.0
 */
@EnableEurekaServer // 启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication // 申明让spring boot自动给程序进行必要的配置
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
