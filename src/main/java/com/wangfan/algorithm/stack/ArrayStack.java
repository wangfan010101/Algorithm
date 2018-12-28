package com.wangfan.algorithm.stack;

/**
 * 数组实现栈
 * params: n 是栈大小；count 是栈中元素个数
 */

public class ArrayStack{

    private String[] items;

    private int count = 0;

    private int n = 0;

    public ArrayStack(int n){
        this.items = new String[n];
        this.n = n;
    }

    public boolean push(String item){
        if(count == n) return false;
        items[count++] = item;
        return true;
    }

    public String pop(){
        if(count == 0) return null;
        return items[--count];
    }

}