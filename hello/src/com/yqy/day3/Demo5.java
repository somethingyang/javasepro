package com.yqy.day3;

public class Demo5 {
    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println(a);
    }

    public static void change(int a){
        System.out.println(a);
        a = 20;
        System.out.println(a);
    }
}
