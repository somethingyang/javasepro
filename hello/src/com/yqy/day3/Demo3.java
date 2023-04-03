package com.yqy.day3;

public class Demo3 {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr =new int[]{10,20,34,2,56,7,8,9,76,54};
        for (int j = 1; j < arr.length; j++) {
            for (int i = 0; i < arr.length -  j; i++) {
                if (arr[i]>arr[i + 1]){
                    int r = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = r;
                }
            }
        }

        System.out.println("排序后的数据为");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
