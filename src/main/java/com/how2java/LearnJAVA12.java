package com.how2java;

/**
 * 时间复杂度
 *
 * 当我们知道元素的位置，一步到位就能访问到该元素，这个时间为K，
 * 时间复杂度用大O表示法标记为O(1)，省略了K。而在数组中查找某元素，
 * 我们并不知道这个元素在数组的什么位置，假设数组的长度为n，
 * 有可能该元素刚好在数组的下标为0的位置（第一个位置）循环1次就匹配到了，
 * 时间复杂度为O(1)。也有可能在数组下标为n-1的位置（最后一个位置）
 * 我们要循环n次才能匹配到该值，时间复杂度为O(n)，按照概率计算下来平均是n/2，
 * 即平均时间复杂度为O(n/2)，但我们不应该只考虑平均值，我们要考虑最坏的情况，
 * 即假设每次匹配的元素都在数组的最后一位，因为最坏情况是一种运行时间保证，
 * 运行时间不会再长了，如果我们没特别指定，我们提到的运行时间都是最坏情况的运行时间，
 * 即在数组中查找某元素，时间复杂度为O(n);

 在长度为n数组中：

 直接通过下标去访问元素，时间复杂度为O(1)。

 需要循环查找元素的时候，时间复杂度为O(n)。
 */
public class LearnJAVA12 {

    public static void main(String[] args) {
        Person[] group = new Person[10];
        group[0] = new Person("张三", 21);
        group[1] = new Person("李四", 19);
        group[2] = new Person("王五", 25);
        group[3] = new Person("赵六", 24);
        group[4] = new Person("孙七", 32);
        group[5] = new Person("周八", 17);
        group[6] = new Person("钱九", 24);
        group[7] = new Person("吴十", 23);
        group[8] = new Person("冯十一", 18);
        group[9] = new Person("朱十二", 36);


    }
}
