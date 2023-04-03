package com.yqy.day3;

import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        for (int i = 0 ; i < 3 ; i++ ){
            System.out.println("hello world");
        }

        //水仙花
        for (int i = 100 ; i <= 999 ; i++){
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i){
                System.out.print(i + "\t");
            }

        }

        int i = 0;
        while (i < 3) {
            System.out.println("hello world");
            i++;
        }

        int j = 0;
        do {
            System.out.println("world");
            j++;
        }while ( j <= 3 );


        Random r = new Random();
        int number = r.nextInt(10);
        System.out.println(number);
    }
}
