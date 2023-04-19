package com.yqy.day12;

public class Demo3 {
    public static void main(String[] args) {
        Swim s = ()->{
            System.out.println("游泳");
        };

        s.swimming();
    }
}

@FunctionalInterface
interface Swim{
    void swimming();
}
