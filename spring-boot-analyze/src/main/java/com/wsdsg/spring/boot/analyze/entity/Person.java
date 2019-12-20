package com.wsdsg.spring.boot.analyze.entity;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/12/18 10:55
**/
public class Person {


    private Integer id;
    public String name;
    private Integer age;

    public Person(){}

    private Person(Integer id, String name, Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String eat(){
        return "吃顿大餐";
    }
}
