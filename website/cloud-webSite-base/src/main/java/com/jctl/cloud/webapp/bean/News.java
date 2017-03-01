package com.jctl.cloud.webapp.bean;


import java.util.Date;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
public class News {

    private Date date;
    private Long clickNum;
    private String title;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getClickNum() {
        return clickNum;
    }

    public void setClickNum(Long clickNum) {
        this.clickNum = clickNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
