package com.yqy.day10.USB;

public class KeyBoard implements USB {
    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "成功接入");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "拔出");
    }

    public void keyDown(){
        System.out.println("敲击键盘");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
