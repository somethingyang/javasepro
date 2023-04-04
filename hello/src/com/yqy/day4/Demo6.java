package com.yqy.day4;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        double[] score = new double[6];
        Scanner input = new Scanner(System.in);
        System.out.println("请输入分数");
        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextDouble();
        }
        System.out.println("最终分数为：" + fen(score));
    }

    public static double fen(double[] arr){
        double score1 = 0;
        double max = arr[0];
        double min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            score1 += arr[i];
        }
        System.out.println("最高分是："+max);
        System.out.println("最低分是："+min);
        score1 = (score1 - (max + min)) /(arr.length-2);
        return score1;
    }
}
