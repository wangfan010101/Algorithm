package com.wangfan.algorithm;

import com.wangfan.algorithm.queue.ArrayQueue;
import com.wangfan.algorithm.stack.ArrayStack;
import com.wangfan.algorithm.stack.LinkedStack;

public class App {

    public static void main(String[] args) {

        LinkedStack stack = new LinkedStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

}
