package com.wangfan.algorithm.recursion;

/**
 * n 个台阶，每次可以跨出1个台阶或者2个台阶，问台阶有多少中走法？
 */

public class demo1 {

    public static int f1(int n){

        if(n == 1) return 1;
        if(n == 2) return 2;
        return f1(n - 1) + f1(n - 2);

    }

    public static int f2(int n){
        return 1;
    }


    public static void main(String[] args) {

        System.out.println(f1(11));

    }

}
