package com.jctl.cloud.webapp.bean;

/**
 * @author kay
 * @function 携带分页的实体Entity
 * on 2016/12/26 0026.
 */
public class BasePage {


    private Long startNum;
    private Long endNum;
    private Long pageNum;

    public Long getStartNum() {
        return startNum;
    }

    public void setStartNum(Long startNum) {
        this.startNum = startNum;
    }

    public Long getEndNum() {
        return endNum;
    }

    public void setEndNum(Long endNum) {
        this.endNum = endNum;
    }

    public Long getPageNum() {
        return pageNum;
    }

    public void setPageNum(Long pageNum) {
        this.pageNum = pageNum;
    }
}
