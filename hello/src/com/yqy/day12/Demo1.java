package com.yqy.day12;

/**
 * 利用正则表达式判断输入的QQ号是否正确
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println(checkQQ("23422442323"));
        System.out.println(checkQQ("23422o42323"));

        System.out.println("--------------");

        String name = "蔡徐坤nkijbniuhuonjlho陈立农niohuohjn范丞丞";
        String[] names = name.split("\\w+");
        for (String s : names) {
            System.out.println(s);
        }

        String names1 = name.replaceAll("\\w+"," ");
            System.out.println(names1);

    }

    public static boolean checkQQ(String qq){
        return qq != null && qq.matches("\\d{6,20}");
    }
}
