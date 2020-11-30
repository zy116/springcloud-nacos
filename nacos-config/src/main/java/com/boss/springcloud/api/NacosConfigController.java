package com.boss.springcloud.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/8/10 11:38
 */
@RestController
public class NacosConfigController {

    //方式一：读取nacos配置，不能实现动态更新
//    @Value("${common.name}")
//    private String name;

    //方式二：可以读取nacos中的配置，并且nacos中配置改变，可以读取到
    @Autowired
    ConfigurableApplicationContext applicationContext;

    @GetMapping("/config")
    public String getConfig(){
        String name= applicationContext.getEnvironment().getProperty("spring.datasource.url");
        String age =applicationContext.getEnvironment().getProperty("common.age");
        return name+"今年"+age;
    }
}
