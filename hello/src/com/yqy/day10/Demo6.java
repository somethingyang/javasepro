package com.yqy.day10;

/**
 * 多态的形式
 */

public class Demo6 {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.run();
        System.out.println(a.name);

        Animal b = new Pig();
        //方法调用，编译看左，运行看右
        b.run();
        //变量调用：编译运行都看左边
        System.out.println(b.name);

        Animal c = new Dog();
        if (c instanceof Dog) {
            Dog d = (Dog) c;
            d.jiao();
        }
    }
}

abstract class Animal{
    public String name = "父类动物";
    public abstract void run();
}

class Dog extends Animal{
    public String name = "狗";
    @Override
    public void run() {
        System.out.println("狗会跑");
    }

    public void jiao(){
        System.out.println("汪汪汪");
    }
}

class Pig extends Animal{
    public String name = "猪";
    @Override
    public void run() {
        System.out.println("猪不会跑");
    }

}
