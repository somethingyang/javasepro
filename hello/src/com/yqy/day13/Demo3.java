package com.yqy.day13;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet排序
 */
public class Demo3 {
    public static void main(String[] args) {
        Set<Integer> sets = new TreeSet<>();
        sets.add(12);
        sets.add(7);
        sets.add(9);
        sets.add(3);
        sets.add(64);
        sets.add(78);
        System.out.println(sets);

        Set<String> sets1 = new TreeSet<>();
        sets1.add("MySQL");
        sets1.add("A");
        sets1.add("Java");
        sets1.add("PHP");
        sets1.add("Python");
        sets1.add("C");
        sets1.add("a");
        sets1.add("d");
        sets1.add("C#");
        System.out.println(sets1);

        System.out.println("------------");
        Set<Apple> apples = new TreeSet<>();
        apples.add(new Apple("青苹果","绿色",90.9,9.9));
        apples.add(new Apple("红苹果","红色",79.9,29.0));
        apples.add(new Apple("红富士","红色",19.9,29.0));
        apples.add(new Apple("绿苹果","青色",39.9,20.0));
        System.out.println(apples);
    }
}

class Apple implements Comparable<Apple>{
    private String name;
    private String color;
    private double weight;
    private double price;

    public Apple() {
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }

    public Apple(String name, String color, double weight, double price) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Apple o) {
        //不保留价格相同的
        //return  Double.compare(this.getPrice() ,o.getPrice());

        return  Double.compare(this.getPrice() ,o.getPrice()) >= 0 ? 1 : -1;
    }
}
