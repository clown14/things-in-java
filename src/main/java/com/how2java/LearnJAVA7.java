package com.how2java;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * JAVA自动装箱拆箱
 *
 * 加上valueOf方法的过程，就是Java中经常说的装箱过程。
 * 将int的变量转换成Integer对象，这个过程叫做装箱，
 反之将Integer对象转换成int类型值，这个过程叫做拆箱。
 以上这些装箱拆箱的方法是在编译成class文件时自动加上的，不需要程序员手工介入，因此又叫自动装箱/拆箱。
 *
 * 1、对象是对现实世界的模拟
 * 2、为泛型提供了支持。
 * 3、提供了丰富的属性和API
 */

public class LearnJAVA7 {

    public static void main(String[] args) {
        Integer integer1 = 100;
        int int1 = integer1;

        Long long1 = 100L;
        long l1 = long1;

        Boolean aBoolean = true;
        boolean bool = aBoolean;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(12,13));
        System.out.println(Integer.min(12,13));
        System.out.println(Integer.sum(23,22));
        System.out.println(Integer.valueOf("123"));
        System.out.println(Integer.compare(12,54));
    }
}
