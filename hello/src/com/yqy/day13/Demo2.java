package com.yqy.day13;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {

        Set<Student> sets = new HashSet<>();
        Student s1 = new Student("蔡徐坤",20,"沃尔沃购物袋");
        Student s2 = new Student("蔡徐坤",20,"沃尔沃购物袋");
        Student s3 = new Student("陈立农",21,"沃尔沃购物袋");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        sets.add(s1);
        sets.add(s2);
        sets.add(s3);
        System.out.println(sets);



    }
}

class Student{
    private String name;
    private int age;
    private String sex;

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
