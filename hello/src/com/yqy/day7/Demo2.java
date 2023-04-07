package com.yqy.day7;

import java.util.Random;

class yqy{


    /**
     * 私有化工具类的构造方法可以避免创建工具类的对象，避免内存浪费
     */
    private yqy(){
    }

    /**
     * 生成验证码
     * @param n 验证码位数
     * @return 返回验证码
     */
    public static String createVerifyCode(int n){
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        return code;
    }


    /**
     * 拼接数组的工具类
     * @param arr 需要拼接的数组
     * @return 返回拼接后的结果
     */
    public static String toString(int[] arr){
        if (arr == null){
            return null;
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += (i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        result += "]";
        return result;
    }
}

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(yqy.createVerifyCode(9));
        int[] arr = null;
        int[] arr1 = {};
        int[] arr2 = {2,3,5,67,7};

        System.out.println(yqy.toString(arr));
        System.out.println(yqy.toString(arr1));
        System.out.println(yqy.toString(arr2));

    }
}
