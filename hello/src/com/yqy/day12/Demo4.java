package com.yqy.day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

public class Demo4 {
    public static void main(String[] args) {
        //有序 可重复 有索引
        Collection list = new ArrayList();
        list.add("China");
        list.add("China");
        list.add(true);
        list.add(false);
        list.add(10);
        list.add(10);
        System.out.println(list);

        //无序 不重复 无索引
        Collection list1 = new HashSet();
        list1.add("China");
        list1.add("China");
        list1.add(true);
        list1.add(false);
        list1.add(10);
        list1.add(10);
        System.out.println(list1);

        System.out.println("------------");


        for (Object ele : list){
            System.out.println(ele);
        }

        System.out.println("=============");

        for (Object o : list1) {
            System.out.println(o);
        }
    }

}
