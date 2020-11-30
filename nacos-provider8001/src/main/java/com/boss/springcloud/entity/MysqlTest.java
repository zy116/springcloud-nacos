package com.boss.springcloud.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zouyou
 * @date 2020/11/4 16:47
 */
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@TableName(value = "test1")
public class MysqlTest {

    @TableField(value = "rec_id")
    private String recId;

    private String pid;

    private String name;

    public String getRecId() {
        return recId;
    }

    public void setRecId(String recId) {
        this.recId = recId;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
