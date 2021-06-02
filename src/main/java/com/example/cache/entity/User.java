package com.example.cache.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.SqlCondition;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;

/**
 * Created by xianpeng.xia
 * on 2019-08-25 01:35
 */
@TableName("user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;
    /*
    自增策略
     */
    @TableId(type = IdType.AUTO)

    /*
    全局策略
    @TableId(type = IdType.NONE)
    */

    /*
    uuid
    @TableId(type = IdType.UUID)
    */

    private Long id;
    //@TableField("name")
    @TableField(condition = SqlCondition.LIKE)
    private String name;
    private Integer age;
    private String email;
    private Long managerId;
    private LocalDateTime createTime;

    @TableField(exist = false)
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
