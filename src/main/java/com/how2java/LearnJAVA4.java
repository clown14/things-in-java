package com.how2java;

/**
 * 所谓数组，是相同数据类型的元素按一定顺序排列的集合。
 *
 */
public class LearnJAVA4 {
    public static void main(String[] args) {
        //声明数组的三种写法
       /* char[] charArr1 = {'a', 'b', 'c' };
        char[] charArr2 = new char[]{'图', '解', 'J', 'A', 'V', 'A' }; //编译器方法
        char[] charArr3 = new char[5];
        charArr3[0] = '1';
        charArr3[1] = '0';
        charArr3[2] = '0';
        charArr3[3] = '8';
        charArr3[4] = '6';
        */

        char[] charArr = {'a', 'b', 'c' };
        char[] charArr2 = charArr;
        charArr[1] = 'x';
        System.out.println(charArr2);
        int[] intArr = {1, 2, 3};
        System.out.println(intArr);
    }
}
