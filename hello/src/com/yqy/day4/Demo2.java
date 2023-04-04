package com.yqy.day4;

import java.util.Scanner;

public class Demo2 {
    //算机票
    public static void main(String[] args) {
        System.out.println("请输入原价、月份、类型(0代表头等舱 1代表经济舱)");
        Scanner res = new Scanner(System.in);
        double money =res.nextDouble();
        int month = res.nextInt();
        int l = res.nextInt();
        System.out.println("最终价格为：" + tick(money, month, l));
    }
    public static double tick(double money, int month, int l){
        if (month <= 0 || month >= 13){
            System.out.println("输入的月份有误");
            return -1;
        }
        if(month >= 5 && month <= 10){
            switch (l){
                case 0:
                    money = money * 0.9;
                    break;
                case 1:
                    money = money * 0.85;
                    break;
                default:
                    System.out.println("输入的舱位类型有误");
                    money = -1;
            }
        }else {
            switch (l){
                case 0:
                    money = money * 0.7;
                    break;
                case 1:
                    money = money * 0.65;
                    break;
                default:
                    System.out.println("输入的舱位类型有误");
                    money = -1;
            }
        }
        return money;
    }
}
