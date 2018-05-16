package com.how2java;

/**
 * String
 *
 * 在Java中，当值被双引号引起来(如本示例中的"abc")，
 * JVM会去先检查看一看常量池里有没有abc这个对象，
 * 如果没有，把abc初始化为对象放入常量池，如果有，直接返回常量池内容。
 */
public class LearnJAVA5 {
    public static void main(String[] args) {
        String s = "abc";
        String str = new String("abc");
        String str2 = new String("abc");

        System.out.println(str.isEmpty());
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.substring(2,3));
        System.out.println(str.equals(str2));
        System.out.println(s);

    }
}
