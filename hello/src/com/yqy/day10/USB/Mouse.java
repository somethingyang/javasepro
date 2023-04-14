package com.yqy.day10.USB;

public class Mouse implements USB {
    private String name;

    public Mouse(String name) {
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

    public void click(){
        System.out.println("鼠标点击");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
