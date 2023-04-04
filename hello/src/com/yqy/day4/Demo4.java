package com.yqy.day4;

import java.util.Random;
import java.util.Scanner;

public class Demo4 {
    //验证码
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("请输入需要的位数");
        int code = c.nextInt();
        System.out.println("输出的验证码为：" + yan(code));
    }

    public static String yan(int n){
        String str = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);
            switch (type){
                case 0:
                    //大写字母（A：65--Z：65+25）
                    char ch1 = (char) r.nextInt(65,90);
                    str += ch1;
                    break;
                case 1:
                    //小写字母（a：97--Z：97+25）
                    char ch2 = (char) r.nextInt(97,122);
                    str += ch2;
                    break;
                case 2:
                    str += r.nextInt(10);
                    break;
            }
        }
        return str;
    }
}
