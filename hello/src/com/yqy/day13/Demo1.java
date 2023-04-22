package com.yqy.day13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        //无序 不重复 无索引
        Set<String> name = new HashSet<>();
        name.add("蔡徐坤");
        name.add("蔡徐坤");
        name.add("java");
        name.add("yqy");
        name.add("java");
        name.add("yqy");
        name.add("My");
        System.out.println(name);

        //有序 不重复 无索引
        Set<String> name1 = new LinkedHashSet<>();
        name1.add("蔡徐坤");
        name1.add("蔡徐坤");
        name1.add("java");
        name1.add("yqy");
        name1.add("java");
        name1.add("yqy");
        name1.add("My");
        System.out.println(name1);
    }
}
