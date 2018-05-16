package com.how2java;

public class Monkey implements Primat {
    String name;

    public Monkey(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + "吃香蕉");
    }

    @Override
    public void move() {
        System.out.println(name + "在树上跳来跳去");
    }
}
