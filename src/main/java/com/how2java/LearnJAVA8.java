package com.how2java;

/**
 * 面向对象
 */
public class LearnJAVA8 {
    public static void main(String[] args) {
        Animal animal1 = new Monkey("小猴1");
        Animal animal2 = new Person2("张三", "男", 21);

        Primat primat = new Person2("李四", "男", 22);
        Person2 person3 = new Person2("王小花", "女", 18);
        Person2 person4 = new Person2("王五", "男",26);

        animal1.eat();
        animal2.eat();

        primat.move();
        primat.eat();

        person3.eat();
        person3.move();
        person3.printAge();
        person4.printAge();
        ((Person2)animal2).printAge();
    }
}
