package com.yqy.day2;

public class Demo7 {
    public static void main(String[] args) {
        {
            String weekday = "周2";
            switch (weekday) {
                case "周三":
                    System.out.println("3");
                    break;
                case "周日":
                    System.out.println("7");
                    break;
                default:
                    System.out.println("数据有误");
            }
        }

        //switch穿透的使用
        int a = 4;
        switch (a){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("小于等于5");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("6--10");
                break;
            default:
                System.out.println("数据有误");
        }
    }
}
