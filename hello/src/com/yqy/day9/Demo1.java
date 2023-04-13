package com.yqy.day9;

public class Demo1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run();
    }
}

enum Season{
    SPRING,SUMMER,AUTUMN,WINTER;
}


/**
 * final可以用于修饰工具类等特殊场景
 */
final class A{

}

abstract class Animal{
    public abstract void run();
}

class Dog extends Animal{
    @Override
    public void run() {
        System.out.println("dog run");
    }
}
