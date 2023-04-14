package com.yqy.day10;

public interface Demo5 {
    /**
     * JDK 8开始，接口新增的用法
     * 默认方法（实例方法），用default修饰，由于接口不可以创建对象，所以这个方法只能通过实现类调用
     */
    default void run() {
        System.out.println("跑");
        sleep();
    }

    /**
     * JDK 8开始，接口新增的用法
     * 静态方法，用static修饰，必须使用接口名调用
     */
    static void eat(){
        System.out.println("吃");
    }

    /**
     * JDK 9开始，接口新增的用法
     * 私有方法（实例方法），用private修饰，必须在接口内部才可以访问
     */
    private void sleep(){
        System.out.println("睡觉");
    }

}

class PingPongMan implements Demo5 {
}

class Test {
    public static void main(String[] args) {
        PingPongMan p = new PingPongMan();
        p.run();
        Demo5.eat();
    }
}
