package com.yqy.day6;

import java.util.ArrayList;
import java.util.Objects;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add("Java");
        list.add(999);
        list.add(false);
        list.add(true);
        list.add('中');
        list.add(1,"huawei");

        System.out.println(list.get(1));
        System.out.println(list.size());
        for (Object o : list) {
            System.out.println(o);
        }
        Object e2 = list.remove(0);

        System.out.println(e2);

        System.out.println(list.remove(false));

        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<Integer>();
//        ArrayList<Integer> list1 = new ArrayList<>(); 后面的Integer可以不写
        list1.add(789);
        list1.add(345);
        list1.add(190);
        System.out.println(list1);

        int e3 = list1.set(0,456);
        System.out.println(e3);
        System.out.println(list1);

    }
}
