package com.how2java;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList底层数组扩容
 */
public class LearnJAVA11 {
    public static void main(String[] args) {
        Person[] perArr = new Person[5];
        perArr[0] = new Person("张三");
        perArr[1] = new Person("李四");
        perArr[2] = new Person("王五");
        perArr[3] = new Person("赵六");
        perArr[4] = new Person("孙七");

        Person[] newPerArr = new Person[10];
        System.arraycopy(perArr, 0, newPerArr, 0, perArr.length);
        perArr[5] = new Person("周八");

        List<Person> list2 = new ArrayList<>(50);
    }
}
