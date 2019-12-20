package com.wsdsg.spring.boot.analyze.controller.dynamic.proxy;

import java.lang.reflect.*;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/12/19 10:03
**/
public class TestDynamicProxy {


    /**
     * Proxy.getProxyClass()方式 比较容易理解
    */
    private static void test1() throws Exception{
        Class proxyClass = Proxy.getProxyClass(Calculate.class.getClassLoader(), Calculate.class);
        Constructor constructor = proxyClass.getConstructor(InvocationHandler.class);
        Calculate calculateProxyImpl = (Calculate) constructor.newInstance(new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("开始了。。。");
                CalculateImpl calculate = new CalculateImpl();
                System.out.println(calculate.getClass().getName());
                Object invoke = method.invoke(calculate, args);
                System.out.println(invoke);
                System.out.println("结束了。。。");
                return invoke;
            }
        });
        calculateProxyImpl.add(4,5);
        calculateProxyImpl.subtract(7,3);
        System.out.println(calculateProxyImpl.getClass().getName());
    }




    /**
     * Proxy.newProxyInstance()方式  实际开卡中使用 简便
     * 注意：newProxyInstance的第二个参数是接口的实现类的class对象获取它的接口数组
     * 如果直接用接口的class对象获取他的接口数组 由于该接口没有实现的接口 所以会报错
    */
    private static void test2(){
        Calculate o = (Calculate)Proxy.newProxyInstance(Calculate.class.getClassLoader(), CalculateImpl.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("-----开始了。。。");
                CalculateImpl calculate = new CalculateImpl();
                Object invoke = method.invoke(calculate, args);
                System.out.println(invoke);
                System.out.println("-----结束了。。。");
                return invoke;
            }
        });
        o.add(10,25);
    }


    /**
     * 上面两种方式和Calculate绑定死了，属于硬编码，我们利用Object解耦
    */
    private static  Object getInterfaceProxy(final Object target){
        Object targetProxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("-----开始了。。。");
                Object invoke = method.invoke(target, args);
                System.out.println(invoke);
                System.out.println("-----结束了。。。");
                return invoke;
            }
        });
        return targetProxy;
    }

    private static void test3(){
        CalculateImpl calculate = new CalculateImpl();
        Calculate calculate1Proxy = (Calculate)getInterfaceProxy(calculate);
        calculate1Proxy.add(20,56);
        calculate1Proxy.subtract(55,33);
    }



    public static void main(String[] args) throws Exception {
        test1();
        //test2();
        //test3();

    }

}
