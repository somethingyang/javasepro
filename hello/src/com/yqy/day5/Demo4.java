package com.yqy.day5;

public class Demo4 {
    public static void main(String[] args) {
        String test = "12345678";

        System.out.println(test.length());
        System.out.println("=============");

        System.out.println(test.charAt(4));
        System.out.println("------------");

        char[] ch = test.toCharArray();
        for (char c : ch) {
            System.out.println(c);
        }
        System.out.println("-------------");

        System.out.println(test.substring(3,7));
        System.out.println(test.substring(2));
        System.out.println("==============");

        System.out.println(test.replace("56","00"));

        System.out.println(test);

        System.out.println(test.contains("56"));

        System.out.println(test.startsWith("1234"));

        String name = "华为，鸿蒙，吴京，战狼";
        String[] name2 = name.split("，");
        for (String i : name2){
            System.out.println(i);
        }
    }
}
