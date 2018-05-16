package com.how2java;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList初始化
 */
public class LearnJAVA10 {
    public static void main(String[] args) {

        List<Person> list1 = new ArrayList<>();
        List<Person> list2 = new ArrayList<>();

        Person person1 = new Person("张三");
        list1.add(person1);

        System.out.println("list1.size:" + list1.size());
        System.out.println("list2.size:" + list2.size());

    }
}
