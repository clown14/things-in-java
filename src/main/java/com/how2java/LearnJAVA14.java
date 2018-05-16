package com.how2java;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList的时间复杂度
 *
 * 如果我们不指定位置直接添加元素时(add(E element))，
 * 元素会默认会添加在最后，不会触发底层数组的复制，
 * 不考虑底层数组自动扩容的话，时间复杂度为O(1) ，
 * 在指定位置添加元素(add(int index, E element))，
 * 需要复制底层数组，根据最坏打算，时间复杂度是O(n)
 */
public class LearnJAVA14 {
    public static void main(String[] args) {
        List<Person> perList = new ArrayList<>();
        perList.add(new Person("张三", 21));
        perList.add(new Person("李四", 19));
        perList.add(new Person("王五", 25));
        perList.add(new Person("赵六", 24));
        perList.add(new Person("孙七", 32));
        perList.add(new Person("周八", 17));
        perList.add(new Person("钱九", 24));
        perList.add(new Person("吴十", 23));

        perList.add(2, new Person("李莫愁", 29));
    }
}
