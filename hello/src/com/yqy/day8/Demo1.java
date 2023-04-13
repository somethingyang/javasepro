package com.yqy.day8;

/**
 * 旧手机，父类
 */
class Phone{
    public void call(){
        System.out.println("打电话");
    }
    public void sendMessage(){
        System.out.println("发短信");
    }
}

/**
 *新手机，子类
 */
class NewPhone extends Phone{
    @Override
    public void call(){
        super.call();
        System.out.println("视频电话");
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("发送语音信息");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        NewPhone huawei = new NewPhone();
        huawei.call();
        huawei.sendMessage();
    }
}
