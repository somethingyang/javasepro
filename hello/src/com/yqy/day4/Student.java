package com.yqy.day4;

//Demo10调用
public class Student {
    String name;
    int age;
    double score;

    public void study(){
        score++;
    }

    public void print(){
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("成绩：" + score);
    }
}
