package com.wangfan.algorithm.queue;

/**
 * 数组实现队列
 */
public class ArrayQueue {

    private String[] items;

    private int head;

    private int tail;

    public ArrayQueue(int size){
        this.items = new String[size];
        this.head = size;
        this.tail = size;
    }

    public boolean enqueue(String item){
        if(head == 0) return false;
        items[--head] = item;
        return true;
    }

    public String dequeue(){
        if(head == tail) return null;
        return items[--tail];
    }

}
