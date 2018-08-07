package com.cjm.entity;

import java.util.Date;

/**
 * 用户类。
 *
 * @author rango
 *         2018-06-02 21:00
 **/
public class User {

    /**
     * ID。
     */
    private String id;

    /**
     * 更新时间。
     */
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
