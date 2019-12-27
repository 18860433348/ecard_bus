package com.ets.tkmybatistest.entity;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/7/31 16:03
**/

public class PageInfo {
    private Integer pageSize;
    private Integer pageNum;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "pageSize=" + pageSize +
                ", pageNum=" + pageNum +
                '}';
    }
}
