package com.boss.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "provider-server")
public interface NacosConsumer {

    @GetMapping("/{id}")
    String getId(@PathVariable("id") String id);
}
