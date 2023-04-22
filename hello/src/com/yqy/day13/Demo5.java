package com.yqy.day13;

import java.util.*;
import java.util.function.BiConsumer;

public class Demo5 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("鸡", 100);
        maps.put("雪豹", 200);
        maps.put("瑞克5代", 90);
        maps.put("芙蓉王", 90);
        maps.put("芙蓉王", 1); //会覆盖前面的元素
        //maps.put(null, null);

        System.out.println(maps);

        Map<String, Integer> maps1 = new LinkedHashMap<>();
        maps1.put("鸡", 100);
        maps1.put("雪豹", 200);
        maps1.put("瑞克5代", 90);
        maps1.put("芙蓉王", 90);
        maps1.put("芙蓉王", 1); //会覆盖前面的元素
        maps1.put(null, null);

        System.out.println(maps1);

        maps1.clear(); //清空

        System.out.println(maps1);

        System.out.println(maps1.isEmpty());

        System.out.println("-----------");
        System.out.println(maps.get("芙蓉王"));
        System.out.println(maps.get("瑞克6代"));

        System.out.println("============");

        System.out.println(maps.remove("鸡"));
        System.out.println(maps);

        System.out.println("============");

        System.out.println(maps.containsKey("瑞克5代"));
        System.out.println(maps.containsKey("鸡"));

        System.out.println(maps.containsValue(1));
        System.out.println(maps.containsValue(200));
        System.out.println(maps.containsValue(101));

        System.out.println("==========");

        Set<String> keys = maps.keySet();
        System.out.println(keys);

        Collection<Integer> values= maps.values();
        System.out.println(values);

        System.out.println("============");

        Set<Map.Entry<String , Integer>> entries = maps.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + "==>" + value);
        }

        maps.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s + "+" + integer);
            }
        });
    }
}
