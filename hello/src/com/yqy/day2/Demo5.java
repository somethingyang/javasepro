package com.yqy.day2;

public class Demo5 {
    public static void main(String[] args) {
        {
            int a = 10;
            int b = 10;

            boolean re = a == b;
            System.out.println(re);

            System.out.println(a == b);
            System.out.println(a != b);
            System.out.println(a > b);
            System.out.println(a >= b);

            double size = 9.8;
            double storage = 16;

            System.out.println("--------------");

            System.out.println(size >= 6.95 & storage >= 18);

            System.out.println(size >= 6.95 | storage >= 18);

            System.out.println(!(size >= 6.95 | storage >= 18));

            System.out.println("--------------");

            System.out.println(false ^ false);
            System.out.println(false ^ true);
            System.out.println(true ^ false);
            System.out.println(true ^ true);

            //三元运算符
            double score = 98;
            String rs1 = score >= 60 ? "考试通过" : "未通过";
            System.out.println(rs1);
        }

        {
            //从两个整数中找出较大值
            int a = 10;
            int b = 2000;
            int max = a > b ? a : b;
            System.out.println(max);
        }

        {
            int num1 = 10;
            int num2 = 10;
            int num3 = 50;
            int temp = num1 > num2 ? num1 : num2;
            int res = temp > num3 ? temp : num3;
            System.out.println(res);

            int res2 = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
            System.out.println(res2);
        }
    }
}
