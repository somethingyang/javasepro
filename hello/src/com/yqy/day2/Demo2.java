package com.yqy.day2;

public class Demo2 {
    public static void main(String[] args) {
        {
            //自动类型转换
            byte a = 20;
            int b = a;
            System.out.println(a);
            System.out.println(b);

            int age = 23;
            double db = age;
            System.out.println(age);
            System.out.println(db);

            char ch = 'a';
            int code = ch;
            System.out.println(ch);
            System.out.println(code);
        }

        {
            //表达式自动类型转换
            byte a = 20;
            int b = 20;
            double c = 1.0;
            double re = a+b+c;
            System.out.println(re);

            double re1 = a + b -2.3;
            System.out.println(re1);

            byte i = 100;
            byte j = 120;
            int k = i + j;
            System.out.println(k);
        }

        {
            //强制类型转换
            int a = 20;
            byte b = (byte) a;
            System.out.println(b);

            int a1 = 1500;
            byte b1 = (byte) a1;
            System.out.println(b1);

            double score = 99.99;
            int sc = (int) score;
            System.out.println(sc);
        }
    }
}
