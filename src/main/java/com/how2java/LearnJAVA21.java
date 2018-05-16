package com.how2java;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap底层实现原理
 *
 * HashMap是怎么解决冲突的:
 * new一个新的Node对象并把当前Node的next引用指向该对象，
 * 也就是说原来该位置上只有一个元素对象，现在转成了单向链表
 *
 * 当链表长度到8时，将链表转化为红黑树来处理,
 * 在JDK1.7及以前的版本中，HashMap里是没有红黑树的实现的，
 * 在JDK1.8中加入了红黑树是为了防止哈希表碰撞攻击，
 * 当链表链长度为8时，及时转成红黑树，提高map的效率。
 *
 *
 * 在hashMap中放入（put）元素，有以下重要步骤：

 1、计算key的hash值，算出元素在底层数组中的下标位置。

 2、通过下标位置定位到底层数组里的元素（也有可能是链表也有可能是树）。

 3、取到元素，判断放入元素的key是否==或equals当前位置的key，成立则替换value值，返回旧值。

 4、如果是树，循环树中的节点，判断放入元素的key是否==或equals节点的key，成立则替换树里的value，并返回旧值，不成立就添加到树里。

 5、否则就顺着元素的链表结构循环节点，判断放入元素的key是否==或equals节点的key，成立则替换链表里value，并返回旧值，找不到就添加到链表的最后。

 精简一下，判断放入HashMap中的元素要不要替换当前节点的元素，key满足以下两个条件即可替换：

 1、hash值相等。

 2、==或equals的结果为true。


 */
public class LearnJAVA21 {
    public static void main(String[] args) {
        Map<String, Person> personMap = new HashMap<>();
        personMap.put("张三", new Person("张三", 21));
        personMap.put("李四", new Person("李四", 19));
        personMap.put("王五", new Person("王五", 25));
        personMap.put("赵六", new Person("赵六", 24));
        personMap.put("孙七", new Person("孙七", 32));
        personMap.put("周八", new Person("周八", 17));
        personMap.put("钱九", new Person("钱九", 24));
        personMap.put("吴十", new Person("吴十", 23));

        Person oldPerson1 = personMap.put("张三", new Person("新张三", 21));
        Person oldPerson2 = personMap.put("孙七", new Person("新孙七", 322));

        System.out.println("oldPerson1.getNmae():" + oldPerson1.getName());
        System.out.println("oldPerson2.getNmae():" + oldPerson2.getName());
        System.out.println("Map.seze: " + personMap.size());
    }
}
