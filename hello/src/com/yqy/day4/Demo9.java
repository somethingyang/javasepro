package com.yqy.day4;

public class Demo9 {
    public static void main(String[] args) {
        //创建汽车对象
        Car c = new Car();
        c.name = "🐎";
        c.price = 30;
        System.out.println(c.name);
        System.out.println(c.price);
        c.start();
        c.run();

        System.out.println("----------");
        Car c2 = new Car();
        c2.name = "奔";
        c2.price = 35;
        System.out.println(c2.name);
        System.out.println(c2.price);
        c2.start();
        c2.run();
    }
}
