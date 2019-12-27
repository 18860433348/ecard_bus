package com.ets.tkmybatistest.dto;

import java.util.List;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/7/11 15:10
**/
public class ReseltPage {
    //返回数据集
    private List<Object> data;
    //总条数
    private Long total;
    //总页数
    private int pages;

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
