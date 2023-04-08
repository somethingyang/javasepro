package com.yqy.day7;

import java.util.ArrayList;

public class Demo4 {

    /**
     *定义静态集合存储牌，静态代码块的使用
     */
    public static ArrayList<String> cards = new ArrayList<>();

    static {
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"♥","♠","♦","♣"};
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                String card = sizes[i] + colors[j];
                cards.add(card);
            }
        }
        cards.add("小🃏");
        cards.add("大🃏");
    }

    public static void main(String[] args) {
        System.out.println("牌：" + cards);
    }
}
