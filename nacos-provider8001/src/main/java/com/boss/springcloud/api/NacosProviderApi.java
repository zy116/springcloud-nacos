package com.boss.springcloud.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/8/10 14:27
 */

public interface NacosProviderApi {

    @GetMapping("/{id}")
    String getId(@PathVariable("id") String id);
}
