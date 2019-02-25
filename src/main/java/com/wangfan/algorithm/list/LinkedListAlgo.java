package com.wangfan.algorithm.list;

public class LinkedListAlgo {

    // reverse
    public static Node reverse(Node list){

        Node headNode = null;
        Node currentNode = list;
        Node previousNode = null;

        while(currentNode != null){
            Node nextNode = currentNode.next;
            if(nextNode == null) headNode = currentNode;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        return headNode;
    }


    public static void main(String[] args) {

        LinkedListAlgo demo = new LinkedListAlgo();

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
