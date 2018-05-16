package com.how2java;


/**
 * 令人疑惑的Java代码
 *
 * Integer的作者在写这个类时，为了避免重复创建对象，对Integer值做了缓存，
 * 如果这个值在缓存范围内，直接返回缓存好的对象，否则new一个新的对象返回
 * 这个类在初始化的时候，会去加载JVM的配置，如果有值，就用配置的值初始化缓存数组，否则就缓存-128到127之间的值
 *
 *
 * 我们在比较两个Integer对象的值时，无论是怎么声明的，都一定要使用equals去比较，
 * 不能用==，在Java中没有重载操作符这一说，特别是从其它语言转到Java的童鞋们要注意
 *
 */
public class LearnJAVA1
{
    public static void main( String[] args )
    {
        Integer i3 = 100;
        Integer i4 = 100;
        System.out.println(i3 == i4);

        Integer i5 = 1000;
        Integer i6 = 1000;
        System.out.println(i5 == i6);

    }
}