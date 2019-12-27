package com.ets.tkmybatistest.util;

public enum PersonEnum {
    XIAO_MING("小明",22,175),
    FANG_FANG("芳芳",25,165),
    DA_LONG("大龙",21,180);

    private String name;
    private Integer age;
    private Integer hign;

    PersonEnum(String name, Integer age, Integer hign) {
        this.name = name;
        this.age = age;
        this.hign = hign;
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

    public Integer getHign() {
        return hign;
    }

    public void setHign(Integer hign) {
        this.hign = hign;
    }
}
