package com.wsdsg.spring.boot.analyze.controller;

import com.wsdsg.spring.boot.analyze.entity.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
*@Author DoubleC
*@Description 测试反射
*@Date 2019/12/18 10:58
**/
public class TestReflect {

    public static void run() throws Exception {
        // 类名获取
        Class<Person> personClass = Person.class;

        // 对象获取
        /*Person person = new Person();
        Class<? extends Person> aClass = person.getClass();*/

        // Class类静态方法获取
        /*try {
            Class<?> aClass1 = Class.forName("com.wsdsg.spring.boot.analyze.entity.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        /**
         * 获取空参构造并实例化
        */
        /*Constructor<Person> constructor = personClass.getConstructor();
        Person person = constructor.newInstance();
        System.out.println(constructor);
        System.out.println(person.eat());*/

        /**
         * 获取有参构造并实例化（因为有参构造是私有的，直接获取会报错）
         */
        /*Constructor<Person> constructor = personClass.getConstructor(Integer.class, String.class, Integer.class);
        Person person = constructor.newInstance(1, "achuan", 25);
        System.out.println(person.getId()+" "+person.getName()+" "+person.getAge());*/


        /**
         * 获取私有 有参构造并实例化（setAccessible(boolean flag) 反射的对象是否实施 Java 语言访问检查）
         */
        /*Constructor<Person> constructor = personClass.getDeclaredConstructor(Integer.class, String.class, Integer.class);
        constructor.setAccessible(true);// 值为true取消语法检查
        Person person = constructor.newInstance(1, "achuan", 25);
        System.out.println(person.getId()+" "+person.getName()+" "+person.getAge());*/

        /**
         * 快速创建实例（类必须有空参构造才可以,class.newInstance()底层就是无参构造对象的newInstance()）
         */
        /*Person person = personClass.newInstance();
        System.out.println(person.eat());*/


        /**
         * 反射获取公有字段并改值
         */
        /*Person person = personClass.newInstance();
        Field nameField = personClass.getField("name");
        nameField.set(person,"xiaolong");
        System.out.println(person.getName());*/

        /**
         * 反射获取私有成员变量并改值
         */
        /*Person person = personClass.newInstance();
        Field age = personClass.getDeclaredField("age");
        age.setAccessible(true);
        age.set(person,20);
        System.out.println(person.getAge());*/


        /**
         * 反射获取有参成员方法并运行
         */
        /*Person person = personClass.newInstance();
        Method setAgeMethod = personClass.getMethod("setAge", Integer.class);
        setAgeMethod.invoke(person, 55);
        System.out.println(person.getAge());*/


    }



    public static void main(String[] args) throws Exception {
        run();
    }

}
