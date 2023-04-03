package com.yqy.day3;

public class Demo6 {
    public static void main(String[] args) {
       int[] arrs =  {10,20,30};
       change(arrs);
        System.out.println(arrs[1]);
    }

    public static void change(int[] arrs){
        System.out.println(arrs[1]);
        arrs[1] = 222;
        System.out.println(arrs[1]);
    }
}
