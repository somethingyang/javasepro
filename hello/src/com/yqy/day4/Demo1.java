package com.yqy.day4;

public class Demo1 {
    public static void main(String[] args) {
        fire();
        fire("米国");
        fire("岛国",1000);
    }
    public static void fire(){
        System.out.println("fire");
    }
    public static void fire(String location){
        System.out.println("fire" + location);
    }

    public static void fire(String location , int num){
        System.out.println("fire" + location + num);
    }

}
