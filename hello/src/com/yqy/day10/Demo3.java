package com.yqy.day10;

public class Demo3 implements Demo2{
    private String userName;
    public Demo3(String userName) {
        this.userName = userName;
    }

    @Override
    public void run() {
        System.out.println(NAME + "跑步");
    }

    @Override
    public void eat() {
        System.out.println(NAME1 + "吃饭");

    }

    @Override
    public void sleep() {
        System.out.println(userName + "睡觉");

    }
}
