package com.yqy.day4;

import java.util.Random;
import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        int[] luckNumbers = createLuckNumber();
        int[] userNumbers = userInputNumbers();

        System.out.print("你输入的号码是：");
        printArray(userNumbers);

        System.out.print("中奖号码是：");
        printArray(luckNumbers);

        judge(luckNumbers,userNumbers);

    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length -1 ? arr[i] + "]\n":arr[i] + ",");
        }
    }

    public static int[] createLuckNumber(){
        int[] numbers = new int[7];
        Random r = new Random();
        for (int i = 0; i < numbers.length-1; i++) {
            while (true){
                int data = r.nextInt(1,34);
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if(numbers[j] == data){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    numbers[i] = data;
                    break;
                }
            }
        }
        numbers[numbers.length-1] = r.nextInt(1,17);
        return numbers;
    }

    public static int[] userInputNumbers(){
        int[] numbers = new int[7];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length-1; i++) {
            System.out.println("请输入第" + (i + 1) + "个红球号码（1-33）：");
            while (true){
                int data = input.nextInt();
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if(numbers[j] == data){
                        flag = false;
                        System.out.println("输入数据有误请重新输入:");
                        break;
                    }
                }
                if (flag){
                    numbers[i] = data;
                    break;
                }
            }
        }
        System.out.println("请输入蓝球号码（1-16）：");
        numbers[numbers.length - 1] = input.nextInt();
        return numbers;
    }

    public static void judge(int[] luckNumber,int[] userNumber){
        int redHitNumbers = 0;
        int blueHitNumbers = 0;

        for (int i = 0; i < userNumber.length-1; i++) {
            for (int j = 0; j < luckNumber.length-1; j++) {
                if(userNumber[i] == luckNumber[j]) {
                    redHitNumbers++;
                    break;
                }
            }
        }
        blueHitNumbers = userNumber[userNumber.length-1] == luckNumber[luckNumber.length-1] ? 1 : 0;
        System.out.println("命中红球数为：" + redHitNumbers);
        System.out.println("命中蓝球数为：" + blueHitNumbers);

        if (redHitNumbers <= 1 && blueHitNumbers == 1) {
            System.out.println("5元");
        } else if (redHitNumbers == 2 || redHitNumbers == 3 && blueHitNumbers == 1 || blueHitNumbers == 0 && redHitNumbers == 4) {
            System.out.println("10元");
        } else if (blueHitNumbers == 1 && redHitNumbers == 4 || redHitNumbers == 5 && blueHitNumbers == 0) {
            System.out.println("200元");
        } else if (blueHitNumbers == 1 && redHitNumbers == 5) {
            System.out.println("3000元");
        } else if (redHitNumbers == 6 && blueHitNumbers ==0) {
            System.out.println("500万元");
        } else if (blueHitNumbers == 1 && redHitNumbers == 6) {
            System.out.println("1000万元");
        }else {
            System.out.println("没有中奖");
        }
    }
}
