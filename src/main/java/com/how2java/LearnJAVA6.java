package com.how2java;

/**
 * JAVA基本数据类型和引用类型
 *
 * 对于基本数据类型来说，赋值（=号）就相当于拷贝了一份值
 *
 * 初始化arr1，当执行到new这个关键字，会在堆内存分配内存空间，并把该内存空间的地址赋值给arr1
 * 对于引用类型来说，赋值（=号）就相当于拷贝了一份内存地址
 *
 * 由于数组arr1和数组arr2指向同一块堆内存，打印arr1[3]和arr2[3]的值，都是8
 *
 * 给对象（数组也是对象）赋值其实就是相当于引用重新指向一块堆内存，基本数据类型是直接修改值
 *
 * 当==两边是基本数据类型时，==于比较的是两边的两个值是否相等，当==两边是引用类型时比较的是两个内存地址，
 * 也可以看成是看这两个引用是否指向堆内存里的同一块地址，
 */
public class LearnJAVA6 {
    public static void main(String[] args) {

        int int1 = 100;
        int int2 = int1;
        int1 = 500;
        System.out.println("int1= " + int1);
        System.out.println("int2= " + int2);

        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = arr1;
        arr1[3] = 8;
        System.out.println("arr1[3]= " + arr1[3]);
        System.out.println("arr2[3]= " + arr2[3]);

        Person per1 = new Person("张三", 21);
        Person per2 = per1;
        per1.setName("李四");
        per1.setAge(35);
        System.out.println("per1 name:" + per1.getName());
        System.out.println("per1 age:" + per1.getAge());
        System.out.println("per2 name:" + per2.getName());
        System.out.println("per2 age:" + per2.getAge());

        System.out.println(int1 == int2);
        System.out.println(arr1 == arr2);
        System.out.println(per1 == per2);

    }
}
