package com.hipay.stock.entity.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 爬取股吧用户配置表
 * </p>
 *
 * @author liyh
 * @since 2023-04-23 04:08:39
 */
@TableName("dfcf_gb_target_user_cfg")
public class DfcfGbTargetUserCfg implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 递增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 爬取全部/当前页
     */
    private String allTag;

    /**
     * 启用
     */
    private String alive;

    /**
     * 时间戳
     */
    private LocalDateTime registerDatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAllTag() {
        return allTag;
    }

    public void setAllTag(String allTag) {
        this.allTag = allTag;
    }

    public String getAlive() {
        return alive;
    }

    public void setAlive(String alive) {
        this.alive = alive;
    }

    public LocalDateTime getRegisterDatetime() {
        return registerDatetime;
    }

    public void setRegisterDatetime(LocalDateTime registerDatetime) {
        this.registerDatetime = registerDatetime;
    }

    @Override
    public String toString() {
        return "DfcfGbTargetUserCfg{" +
        "id = " + id +
        ", userName = " + userName +
        ", userId = " + userId +
        ", allTag = " + allTag +
        ", alive = " + alive +
        ", registerDatetime = " + registerDatetime +
        "}";
    }
}
