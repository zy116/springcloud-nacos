package com.boss.springcloud.api;

import com.boss.springcloud.service.NacosConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/8/10 15:37
 */

@RestController
@RequestMapping("/nacos/controller")
public class NacosConsumerController {

    @Autowired
    private NacosConsumer consumer;
//    NacosProviderApi api;

    @GetMapping("/{getId}")
    public String getIdController(@PathVariable("getId") String getId){
        return consumer.getId(getId);
//        return api.getId(getId);
    }

}
