package com.yqy.day2;

public class Demo4 {
    public static void main(String[] args) {
        int data = 589;
        int ge = data % 10;
        System.out.println(ge);
        int shi = data / 10 % 10;
        System.out.println(shi);
        int bai = data / 100 % 10;
        System.out.println(bai);

        System.out.println("个位:" + ge);
        System.out.println("十位:" + shi);
        System.out.println("百位:" + bai);

        System.out.println(data + 'a');
        System.out.println("pxy" + data + 'a');
        System.out.println("pxy" + (data + 'a'));

        data++;
        System.out.println(data);

        int i = 10;
        int j = ++i;
        System.out.println(i);
        System.out.println(j);

        int m = 10;
        int n = m++;
        System.out.println(m);
        System.out.println(n);

        int a = 10;
        int b = 200;
        a += b;
        System.out.println(a);


    }
}
