package com.yqy.day7;

class User{
    /**
     * static修饰的，静态成员变量，在内存中只有一份，可以被共享
     */
    public static int onlineNumber = 161;

    //静态方法
    public static void add(int a , int b){
        System.out.println(a + b);
        User n = new User();
        System.out.println(n.age);
    }


    /**
     * 实例成员变量：无static修饰，属于每个对象，必须用对象名访问
     */
    private String name;
    private int age;

    public int height;


    public void setHeight(int height) {
        this.height = height;
    }

    /**
     *静态方法中不可以出现this关键字
     */
    public static void setOnlineNumber(int onlineNumber) {
        User.onlineNumber = onlineNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Demo1 {
    public static void main(String[] args) {
        int onlineNumber = User.onlineNumber;
        System.out.println(onlineNumber);

        User u = new User();
        System.out.println(u.onlineNumber);

        u.setName("caixukun");
        System.out.println(u.getName());

        u.height = 180;
        System.out.println(u.height);

        User.add(10,200);
    }
}
