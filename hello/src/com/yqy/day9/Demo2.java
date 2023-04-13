package com.yqy.day9;

public class Demo2 {
    public static void main(String[] args) {
        StudentChild studentChild = new StudentChild();
        studentChild.write();

        StudentMiddle studentMiddle = new StudentMiddle();
        studentMiddle.write();
    }
}

class StudentChild extends Student{
    @Override
    public String writeMain() {
        return "我是小学生";
    }
}

class StudentMiddle extends Student{
    @Override
    public String writeMain() {
        return "我是中学生";
    }
}

abstract class Student {
    /**
     * 模板方法加上final防止子类重写
     */
    public final void write(){
        System.out.println("标题");
        System.out.println("引言");
        System.out.println(writeMain());
        System.out.println("结尾");
    }

    public abstract String writeMain();
}
