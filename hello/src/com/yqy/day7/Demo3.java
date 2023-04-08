package com.yqy.day7;

public class Demo3 {
    public static String schoolname;

    private String name;

    public Demo3(){
        System.out.println("========无参构造器触发触发=========");
    }

    /**
     * 静态代码块
     * 用于初始化静态资源
     */
    static {
        System.out.println("========静态代码块触发=========");
        schoolname = "坤工";
    }

    {
        System.out.println("========实例代码块触发=========");
        name = "蔡徐坤"; //很少使用，会使每一个对象的name都为”蔡徐坤“
    }

    public static void main(String[] args) {
        System.out.println("========main方法触发==========");
        System.out.println(schoolname);

        Demo3 d1 = new Demo3();
        System.out.println(d1.name);
        Demo3 d2 = new Demo3();
        System.out.println(d2.name);
    }
}
