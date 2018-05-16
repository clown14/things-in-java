package com.how2java;

public class Person2 implements Primat {
    String name;
    String sex;
    private  Integer age;

    public Person2(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public void move() {
        System.out.println(name + "开始走路");

    }

    @Override
    public void eat() {
        System.out.println(name + "开始吃饭");
    }

    public void printAge(){
        if (isLady(sex)) {
            System.out.println(name + "女士年龄是秘密");
            return;
        }
        System.out.println(name + age + "岁");
    }

    private boolean isLady(String sex) {
        if (sex.equals("女")) {
            return true;
        }
        return false;
    }


}
