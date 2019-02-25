package com.wangfan.algorithm.stack;

public class LinkedStack {

    private Node top = null;

    public void push(int item){
        if(top == null){top = new Node(item);return;}
        Node itemNode = new Node(item);
        itemNode.next = top;
        top = itemNode;
    }

    public int pop(){
        if(top == null) return -1;
        int data = top.data;
        top = top.next;
        return data;
    }

    public static class Node{

        private int data;

        private Node next;

        public Node(int data){
            this.data = data;
        }

        public int getData(){
            return this.data;
        }

    }

}
