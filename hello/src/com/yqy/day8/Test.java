package com.yqy.day8;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("蔡徐坤");
        s.setAge(25);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.queryCourse();
        s.writeInfo();

        Teacher t = new Teacher();
        t.setName("范丞丞");
        t.setAge(24);
        System.out.println(t.getName());
        System.out.println(t.getAge());
        t.queryCourse();
        t.readInfo();

        s.showSex();
    }
}
