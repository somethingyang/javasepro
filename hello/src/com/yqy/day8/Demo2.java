package com.yqy.day8;

class People1{
    private String name;
    private int age;

    public People1() {
    }

    public People1(String name, int age) {
        this.name = name;
        this.age = age;
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

class Student1 extends People1{
    public Student1(String name, int age){
        super(name,age);
    }
}

public class Demo2 {

    public static void main(String[] args) {
        Student1 s = new Student1("蔡徐坤",25);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }

}
