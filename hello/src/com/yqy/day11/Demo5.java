package com.yqy.day11;

public class Demo5 {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 11;
        System.out.println(a);
        System.out.println(a1);

        //int b = null; 报错
        Integer b1 = null;

        System.out.println("---------");
        Integer i = 23;
        String rs = i.toString();
        System.out.println(rs + 1);

        String rs1 = Integer.toString(i);
        System.out.println(rs1 + 1);

        System.out.println("---------");
        String age = "23";
        int age1 = Integer.parseInt(age);
        int age2 = Integer.valueOf(age);
        System.out.println(age1 + 1);
        System.out.println(age2 + 5);

        String score = "93.9";
        double score1 = Double.parseDouble(score);
        double score2 = Double.valueOf(score);
        System.out.println(score1 + 1);
        System.out.println(score2 + 0.5);
    }
}
