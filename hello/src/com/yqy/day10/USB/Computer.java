package com.yqy.day10.USB;

public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public void start(){
        System.out.println(name + "开机");
    }

    /**
     * 安装USB设备的入口
     */
    public void installUSB(USB usb){
        usb.connect();
        if (usb instanceof KeyBoard){
            KeyBoard k = (KeyBoard) usb;
            k.keyDown();
        } else if (usb instanceof Mouse){
            Mouse m = (Mouse) usb;
            m.click();
        }
        usb.unconnect();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
