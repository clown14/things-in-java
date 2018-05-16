package com.how2java;

/**
 * ArrayList和Vector区别
 *
 * vector只要是关键性的操作，方法前面都加了synchronized关键字，
 * 来保证线程的安全性。当执行synchronized修饰的方法前，
 * 系统会对该方法加一把锁，方法执行完成后释放锁，加锁和释放锁的这个过程，
 * 在系统中是有开销的，因此，在单线程的环境中，Vector效率要差很多
 *
 *
 */
public class LearnJAVA15 {
}
