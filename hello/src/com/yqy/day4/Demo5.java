package com.yqy.day4;

public class Demo5 {
    //数组元素复制
    public static void main(String[] args) {
        int[] str1 = {12,13,14,15};
        int[] str2 = new int[str1.length] ;
        copy(str1,str2);
        printarr(str1);
        printarr(str2);
    }

    public static void copy(int[] str1, int[] str2){
        for (int i = 0; i < str1.length; i++) {
            str2[i] = str1[i];
        }
    }

    public static void printarr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] + "]\n" : arr[i] + ", ");
        }

    }
}
