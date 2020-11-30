package com.boss.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosProvider8001Application.class, args);
        Logger logger = LoggerFactory.getLogger("testRun");
        logger.info("测试logger运行");
    }

}
