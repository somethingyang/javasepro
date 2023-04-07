package com.yqy.day6;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private String id;
    private String name;
    private int age;
    private String grade;

    public Student() {
    }

    public Student(String id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("2020101","蔡徐坤",21,"计科1班"));
        students.add(new Student("2020102","韦一敏",20,"计科1班"));
        students.add(new Student("2020103","王宝强",25,"计科2班"));
        students.add(new Student("2020104","孙笑川",25,"计科2班"));
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getGrade());
        }
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入查询学生的学号：");
            String studentNumber = sc.next();
            Student s = getStudentById(students , studentNumber);
            if (s == null) {
                System.out.println("查无此人!");
            }else {
                System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getGrade());
            }
        }
    }

    /**
     * 根据学生的学号查询学生对象返回
     * @param students      存储全部学生对象的集合
     * @param studentNumber     搜索的学生学号
     * @return      学生对象 | null
     */
    public static Student getStudentById(ArrayList<Student> students, String studentNumber){
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getId().equals(studentNumber)){
                return s;
            }
        }
        return null;
    }
}
