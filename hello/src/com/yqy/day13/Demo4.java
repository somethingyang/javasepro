package com.yqy.day13;

import java.util.Arrays;

public class Demo4 {
    public static void main(String[] args) {
        sum();
        sum(1);
        sum(1,2,3);
        sum(new int[]{12,23,45});
    }

    public static void sum(int...nums){
        //可变参数nums在方法内部就是数组
        System.out.println("元素个数:"+nums.length);
        System.out.println("内容:"+Arrays.toString(nums));
    }
}
