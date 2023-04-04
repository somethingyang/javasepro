package com.yqy.day4;

import java.util.Scanner;

public class Demo7 {
    //数字加密
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入需要加密的位数");
        int num = input.nextInt();
        int[] arr = new int[num];
        System.out.println("请输入数据");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        printArr(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5)%10;
        }
        for (int i = 0 , j = arr.length-1; i < j; i++ , j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        printArr(arr);
    }
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] + "]\n" : arr[i] + ",");
        }
    }
}
