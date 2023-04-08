package com.yqy.day7;

/**
 * 饿汉单例模式的设计
 */

class SingleInstance{


    /**
     * 静态化初始一个对象，使其他人只可以获取到这个对象
     */
    public static SingleInstance name = new SingleInstance();

    /**
     * 私有化构造其使其他人无法调用他构造对象
     */
    private SingleInstance(){
    }
}

public class Demo5 {
    public static void main(String[] args) {
        SingleInstance s1 = SingleInstance.name;
        SingleInstance s2 = SingleInstance.name;

        System.out.println(s1 == s2);//如果s1的地址等于s2就证明他们取到的是同一个对象
    }

}
