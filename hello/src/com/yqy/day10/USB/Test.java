package com.yqy.day10.USB;

public class Test {
    public static void main(String[] args) {
        Computer c =new Computer("Apple");
        c.start();

        USB u = new KeyBoard("键盘");
        c.installUSB(u);

        USB u1 = new Mouse("鼠标");
        c.installUSB(u1);

    }
}
