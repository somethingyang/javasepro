package com.yqy.day12;

import java.util.Arrays;
import java.util.Comparator;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {10,2,5,33,34,100};
        System.out.println(arr);

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //二分查找(必须排好序的才可以用)
        int i = Arrays.binarySearch(arr, 34);
        System.out.println(i);
        int i1 = Arrays.binarySearch(arr, 30);
        System.out.println(i1);

        System.out.println("==========");

        //自定义排序规则 Comparator使用时必须用引用类型的数据才可以用
        Integer[] age1 = {100,12,34,6,8,9,60,4};
        Arrays.sort(age1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(age1));

        System.out.println("=============");

        Student[] students = new Student[3];
        students[0] = new Student("cai",'男',23,185.0);
        students[1] = new Student("xu",'男',29,195.0);
        students[2] = new Student("kun",'女',13,175.0);

        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge(); //按照年龄降序排序
            }
        });
        System.out.println(Arrays.toString(students));
    }
}

class Student{
    private String name;
    private char sex;
    private int age;
    private double height;

    public Student() {
    }

    public Student(String name, char sex, int age, double height) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
