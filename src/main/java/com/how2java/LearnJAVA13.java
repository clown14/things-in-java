package com.how2java;

import java.util.ArrayList;
import java.util.List;

/**
 * 三顾ArrayList
 *
 * 我们说一说ArrayList中删除元素的时间复杂度。在ArrayLIst中，如果底层数组长度为n。
 当我们用下标方式去删除元素时，如果删除的是最后一个元素，
 不会触发数组底层的复制，时间复杂度为O(1)。
 如果删除第i的元素，会触发底层数组复制n-i次，根据最坏情况，时间复杂度为O(n)。
 */
public class LearnJAVA13 {
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
        perList.add(new Person("冯十一", 18));
        perList.add(new Person("朱十二", 36));

        perList.remove(5);
        perList.remove(new Person("孙七", 32));
        //这个孙七是new出来的，不是数组里的孙七，我们没有重写equals，默认判断指向同一引用

       // perList.add(2, new Person("李莫愁", 29));
        System.out.println(perList.size());

    }
}
