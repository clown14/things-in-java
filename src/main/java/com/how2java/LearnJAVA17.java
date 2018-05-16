package com.how2java;

import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList初探
 *
 *
 *
 */
public class LearnJAVA17 {

    public static void main(String[] args) {
        List<Person> perList = new LinkedList<>();
        perList.add(new Person("张三", 21));
        perList.add(new Person("李四", 19));
        perList.add(new Person("王五", 25));
        perList.add(new Person("赵六", 24));

        System.out.println(perList.size());
    }
}
