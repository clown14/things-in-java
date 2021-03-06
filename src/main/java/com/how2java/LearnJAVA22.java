package com.how2java;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet的秘密
 *
 * HashSet虽然底层是用HashMap来实现的，但由于用不到HashMap的value，
 * 所以不会为底层HashMap的每个value分配一个内存空间，因此并不会过多的占用内存，请放心使用
 *
 * TreeSet底层实现也是利用TreeMap来实现的，
 *
 * HashSet底层声明了一个HashMap，HashSet做了一层包装，
 * 操作HashSet里的元素时其实是在操作HashMap里的元素。
 * TreeSet底层也是声明了一个TreeMap，操作TreeSet里的元素其实是操作TreeMap里的元素。
 */
public class LearnJAVA22 {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();//new了一个HashSet
        strSet.add("张三");
        strSet.add("李四");
        strSet.add("王五");
        strSet.add("赵六");

        System.out.println("strSet : " + strSet);
        System.out.println("strSet.size() : " + strSet.size());
        System.out.println("strSet里是否为空 : " + strSet.isEmpty());

        System.out.println("删除王五。。。。");
        boolean delFlag = strSet.remove("王五");
        System.out.println("删除王五是否成功" + delFlag);
        System.out.println("删除王五后的strSet : " + strSet);
        System.out.println("strSet中是否包含王五：" + strSet.contains("王五"));
        System.out.println("strSet中是否包含张三：" + strSet.contains("张三"));

        System.out.println("clear清除元素...");
        strSet.clear();
        System.out.println("clear清除元素后的strSet : " + strSet);
        System.out.println("strSet长度 : " + strSet.size());
        System.out.println("strSet里是否为空 : " + strSet.isEmpty());

    }
}
