package com.boss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zouyou
 * @date 2020/11/9 22:01
 */

@EnableDiscoveryClient
@SpringBootApplication
public class NacosProvider8002Application {
    public static void main(String[] args) {
        SpringApplication.run(NacosProvider8002Application.class, args);
    }

}
