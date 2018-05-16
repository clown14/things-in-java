package com.how2java;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Java数据结构之线性表
 * <p>
 * 栈是一种操作受限制的线性表。其限制是仅允许在线性表的尾部进行添加和删除操作，
 * 这一端被称为栈顶，另一端称为栈底。
 * 向一个栈添加新元素叫压栈，删除元素又称为出栈
 * <p>
 * 队列也是一种操作受限制的线性表。只能从头部删除(取出)元素，
 * 从队尾添加元素，进行删除操作的端称为队头
 */
public class LearnJAVA16 {
    //Queue queue = new Queue();//会报错，Queue是接口，不允许实例化
    Queue queue = new LinkedList();//  正确的用法，基于链表来实现
}
