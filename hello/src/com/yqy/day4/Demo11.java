package com.yqy.day4;

import java.util.Scanner;

class Goods {
    int id;
    String name;
    double price;
    int buyNumber;
}

public class Demo11 {
    public static void main(String[] args) {
        Goods[] shopCar = new Goods[100];
        System.out.println("选择如下命令");
        System.out.println("添加商品到购物车：add");
        System.out.println("查询商品：query");
        System.out.println("修改商品购买数量：update");
        System.out.println("结算购买金额：pay");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入命令：");
        String command = sc.next();
        switch (command){
            case "add":
                addGoods(shopCar,sc);
                break;
            case "query":
                queryGoods(shopCar);
                break;
            case "update":
                updateGoods(shopCar);
                break;
            case "pay":
                payGoods(shopCar);
                break;
        }

    }

    private static void payGoods(Goods[] shopCar) {

    }

    private static void updateGoods(Goods[] shopCar) {

    }

    private static void queryGoods(Goods[] shopCar) {
        
    }

    private static void addGoods(Goods[] shopCar ,Scanner sc) {
        System.out.println("输入购买商品的编号：");
        int id = sc.nextInt();
        System.out.println("输入购买商品的名称：");
        String name = sc.next();
        System.out.println("输入购买商品的数量：");
        int buyNumber = sc.nextInt();
        System.out.println("输入购买商品的价格：");
        double price = sc.nextDouble();

        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.buyNumber = buyNumber;
        g.price =price;

        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null){
                shopCar[i] = g;
                break;
            }
        }
        System.out.println("商品：" + g.name + "添加购物车完成");
    }
}
