package com.wangfan.algorithm.sort;

public class SortOne {

    public static void bubbleSort(int[] a){
        int n = a.length;

        for(int i=0; i<n; i++){

            boolean flag = false;
            for(int j=0;j<n-i-1;j++){
                if(a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;
                }
            }
            if(!flag) break;
        }

    }

    public static void main(String[] args) {
        System.out.println("run App");
    }

}
