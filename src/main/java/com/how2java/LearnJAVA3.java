package com.how2java;

/**
 * 在引用类型中，"=="是比较两个引用是否指向堆内存里的同一个地址（同一个对象），
 * 而equals是一个普通的方法，该方法返回的结果依赖于自身的实现。
 */

public class LearnJAVA3 {

    public static void main(String[] args) {
        String s3 = new String("100");
        String s4 = new String("100");
        System.out.println(s3.equals(s4));

        Integer itr = new Integer("123");
        Long lon = new Long("123");
        System.out.println(itr.equals(lon));

        Person person1 = new Person("张三");
        Person person2 = new Person("张三");
        System.out.println(person1.equals(person2));
    }

}
