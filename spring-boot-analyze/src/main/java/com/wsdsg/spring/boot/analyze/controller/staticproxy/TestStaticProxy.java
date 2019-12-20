package com.wsdsg.spring.boot.analyze.controller.staticproxy;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/12/19 9:57
**/
public class TestStaticProxy {

    public static void main(String[] args){
        com.wsdsg.spring.boot.analyze.controller.staticproxy.CalculateStaticProxy calculateStaticProxy = new com.wsdsg.spring.boot.analyze.controller.staticproxy.CalculateStaticProxy(new com.wsdsg.spring.boot.analyze.controller.staticproxy.CalculateImpl());
        calculateStaticProxy.add(3,4);
        calculateStaticProxy.subtract(6,4);
    }
}
