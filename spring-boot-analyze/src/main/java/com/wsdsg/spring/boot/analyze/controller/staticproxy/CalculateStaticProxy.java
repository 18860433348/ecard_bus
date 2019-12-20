package com.wsdsg.spring.boot.analyze.controller.staticproxy;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/12/19 9:51
**/
public class CalculateStaticProxy implements com.wsdsg.spring.boot.analyze.controller.staticproxy.Calculate {

    private com.wsdsg.spring.boot.analyze.controller.staticproxy.Calculate calculate;

    public CalculateStaticProxy(com.wsdsg.spring.boot.analyze.controller.staticproxy.CalculateImpl calculate){
        this.calculate = calculate;
    }

    @Override
    public int add(int a, int b) {
        System.out.println("加法开始了。。。。");
        int result = calculate.add(a, b);
        System.out.println("加法结束了。。。。");
        return result;
    }

    @Override
    public int subtract(int a, int b) {
        System.out.println("减法开始了。。。。");
        int result = calculate.subtract(a, b);
        System.out.println("减法结束了。。。。");
        return result;
    }
}
