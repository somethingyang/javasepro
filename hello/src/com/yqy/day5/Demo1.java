package com.yqy.day5;

class Student{
    private int age;
    private String name;
    private double height;

    public Student() {
    }

    public Student(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 200){
            this.age = age;
        }else {
            System.out.println("输入的年龄有问题");
        }
    }
}


public class Demo1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(59);
        System.out.println(s.getAge());
    }
}
