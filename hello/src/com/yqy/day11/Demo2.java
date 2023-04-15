package com.yqy.day11;

public class Demo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("abbbb");
        sb.append("awwww");
        sb.append("axxxx");
        sb.append('中');
        sb.append(3);

        System.out.println(sb);

        System.out.println(sb.reverse());

        System.out.println(sb.length());

        String s = sb.toString();
        String s1 = new String(sb);
        System.out.println(s);
        System.out.println(s1);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime)/1000.0);

    }
}
