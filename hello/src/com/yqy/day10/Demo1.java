package com.yqy.day10;

public interface Demo1 {
    //JDK8之前接口中只可以写常量和抽象方法
    public static final String NAME = "蔡徐坤";
    //由于接口体现规范思想，规范默认公开所以可以不写public static final 可以省略不写
    String NAME1 = "潘贤垚";

    public abstract void run();
    //由于接口体现规范思想，规范默认公开所以可以不写public abstract 可以省略不写
    void eat();

}
