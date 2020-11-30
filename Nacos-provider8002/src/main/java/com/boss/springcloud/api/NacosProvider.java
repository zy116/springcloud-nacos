package com.boss.springcloud.api;

import com.boss.springcloud.mapper.NacosProviderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zouyou
 * @date 2020/11/4 16:53
 */
@RestController
public class NacosProvider implements NacosProviderApi{

    @Autowired
    private NacosProviderMapper mapper;

    @Override
    public String getId(String id){
        String name  = mapper.selectByPrimaryId(id);
        return name+"8002";
    }

}
