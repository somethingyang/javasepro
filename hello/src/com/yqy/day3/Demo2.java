package com.yqy.day3;

public class Demo2 {
    public static void main(String[] args) {
        double[] score = new double[]{10.0,50.0};
        int[] score1 = new int[]{10,50};
        String[] name = {"瑞文一","盘县要"};

        int[] arr =new int[5];
        String[] arr1 = new String[8];

        System.out.println(score[1]);
        System.out.println(score1[0]);
        System.out.println(name[0]);

        System.out.println(score1.length);

        System.out.println(arr[3]);
        System.out.println(arr1[5]);

        for (int i = 0; i < score.length; i++){
            System.out.println(score[i]);
        }

        for (int i = 0; i < score1.length; i++) {
            System.out.println(score1[i]);
        }
    }
}
