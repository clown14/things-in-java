package com.how2java;

import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList元素的删除原理
 */
public class LearnJAVA19 {
    public static void main(String[] args) {
        List<Person> perList = new LinkedList<Person>();
        perList.add(new Person("张三", 21));
        perList.add(new Person("李四", 19));
        perList.add(new Person("王五", 25));
        perList.add(new Person("赵六", 24));

        System.out.println(perList.size());
        boolean delState = perList.remove(new Person("王五", 25));
        System.out.println("删除状态" + delState);
        System.out.println("删除后的perList.size():" + perList.size());

    }
}
