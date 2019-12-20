package com.wsdsg.spring.boot.analyze.controller.staticproxy;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/12/19 9:50
**/
public class CalculateImpl implements com.wsdsg.spring.boot.analyze.controller.staticproxy.Calculate {

    /**
    * 有个需求 不改动这个类的源代码 实现每次计算前后都打印日志 可以暂时使用静态代理
    */

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }
}
