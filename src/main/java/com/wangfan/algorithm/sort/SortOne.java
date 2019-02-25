package com.wangfan.algorithm.sort;

public class SortOne {

    public static int[] bubbleSort(int[] a){
        for(int i=0; i < a.length; i++){
            for(int j = 0; j < a.length - i - 1;j++){
                if(a[j] > a[j + 1]){
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        return a;
    }

    public static int[] insertionSort(int[] a){
        int l = a.length;
        for(int i=1;i < l;i++){
            int v = a[i];
            int j = i - 1;
            for(;j >= 0;j--){
                if(a[j] > v){
                    a[j+1] = a[j];
                }else{
                    break;
                }
            }
            a[j+1] = v;
        }
        return a;
    }


    public static void main(String[] args) {
        System.out.println("run App");
        int[] res = insertionSort(new int[]{5,4,3,2,1});
        for(int i=0; i<res.length;i++){
            System.out.println(res[i]);
        }
    }

}
