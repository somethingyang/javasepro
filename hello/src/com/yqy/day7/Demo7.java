package com.yqy.day7;

/**
 * 懒汉单例设计模式
 */
class SingleInstance2{

    private static SingleInstance2 name;
    private SingleInstance2(){
    }


    /**
     * 提供方法，对外返回单例对象
     */
    public static SingleInstance2 getInstance(){
        if (name == null){
            SingleInstance2 name = new SingleInstance2();
        }
        return name;
    }
}

public class Demo7 {
    public static void main(String[] args) {
        SingleInstance2 s1 =SingleInstance2.getInstance();
        SingleInstance2 s2 =SingleInstance2.getInstance();
        System.out.println(s1 == s2);
    }
}
