package com.boss.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.boss.springcloud.entity.MysqlTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface NacosProviderMapper extends BaseMapper<MysqlTest> {

    @Select(" <script>" +
            " select test1.name from test1 where rec_id = #{id}" +
            " </script>")
    String selectByPrimaryId(String id);
}
