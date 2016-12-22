package com.mw.model;

import java.util.Date;

/**
 * Created by wei.ma on 2016/12/22.
 */
public class Test {
    private Long id;

    private String type;

    private Date createTime;

    public Test() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
