package com.ets.tkmybatistest.entity;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/7/31 16:04
**/
public class Data {
    private PageInfo pageInfo;

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public String toString() {
        return "Data{" +
                "pageInfo=" + pageInfo +
                '}';
    }
}
