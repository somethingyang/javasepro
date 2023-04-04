package com.yqy.day4;

class Car1 {
    String name;
    int price;

    public Car1(){
        System.out.println("无参构造器");
    }
    public Car1(String name, int price){
        this.name = name;
        this.price = price;
        System.out.println("有参构造器");
    }
}
public class Demo12 {
    public static void main(String[] args) {

        Car1 ca = new Car1();
        ca.price = 100;
        ca.name = "🐎";
        System.out.println(ca.name);
        System.out.println(ca.price);

        Car1 cs = new Car1("benben", 49);
        System.out.println(cs.name);
        System.out.println(cs.price);

    }
}
