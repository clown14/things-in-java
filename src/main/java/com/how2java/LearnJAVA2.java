package com.how2java;
/**
 *
 * Java字符串那些事
 *
 * 我们在比较两个String对象内容时，无论是怎么声明的，
 * 都一定要使用equals去比较，不能用==，在Java中没有重载操作符这一说，
 *  在JVM中，当代码执行到String s1 = "100" 时，会先看常量池里有没有字符串刚好是“100”这个对象，
 *  如果没有，在常量池里创建初始化该对象，并把引用指向它，
 *
 *  执行到Strings3 = new String("100") 这时候我们加了一个new关键字，
 *  这个关键字呢就是告诉JVM，你直接在堆内存里给我开辟一块新的内存
* */

public class LearnJAVA2 {
    public static void main(String[] args) {
        String s1 = "100";
        String s2 = "100";
        System.out.println(s1 == s2);

        String s3 = new String("100");
        String s4 = new String("100");
        System.out.println(s3 == s4);
    }
}
