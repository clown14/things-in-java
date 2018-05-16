package com.how2java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 要判断两个对象的内容是否相等，不要自己写方法（isSame()）去判断，
 * 而是应该重写父类的 equals方法（这里的父类是Object）
 *
 * Person这个类在重写equals()方法后，虽然已经支持List，但还不支持Set。
 * 要完美支持HashMap,HashSet,LinkedHashMap,ConcurrentHashMap等这些类，
 * 不但要重写equals方法，还需要重写hashCode()方法。
 */
public class LearnJAVA9 {
    public static void main(String[] args) {
        String str1 = new String("张三");
        String str2 = new String("张三");
        Set<String> strSet = new HashSet<>();
        strSet.add(str1);
        strSet.add(str2);
        System.out.println("strSet.size()" + strSet.size());

        Person person1 = new Person(("张三"));
        Person person2 = new Person(("张三"));
        Set<Person> perSet = new HashSet<>();
        perSet.add(person1);
        perSet.add(person2);
        System.out.println("perSet.size()" + perSet.size());


        List<Person> perList = new ArrayList<>();
        perList.add(person1);

        Set<Person> pSet = new HashSet<Person>();
        pSet.add(person1);
        System.out.println("person1.equals(person2):" + person1.equals(person2));
        System.out.println("perList.contains(person2):" + perList.contains(person2));
        System.out.println("pSet.contains(person2):" + pSet.contains(person2));
    }
}
