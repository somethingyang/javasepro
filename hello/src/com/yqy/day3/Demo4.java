package com.yqy.day3;

public class Demo4 {
    public static void main(String[] args) {
        int c1 = sum(10,30);
        System.out.println(c1);

        int c2 = sum(20,80);
        System.out.println(c2);

        print();
    }
    public static int sum(int a , int b){
        return a + b;
    }

    public static void print(){
        System.out.println("hello world");
    }
}
