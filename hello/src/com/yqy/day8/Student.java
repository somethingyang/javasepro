package com.yqy.day8;

/**
 * 学生类，子类
 */

public class Student extends People{

    public String sex = "女";
    public void writeInfo(){
        System.out.println(getName() + "在写");
    }

    public void showSex(){
        System.out.println(this.sex);
        System.out.println(super.sex);
    }
}
