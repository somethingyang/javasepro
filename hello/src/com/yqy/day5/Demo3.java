package com.yqy.day5;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        String okName = "yang";
        String okPassword = "123456";
        String okCode = "2dFre";

        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名：");
        String name = sc.next();
        System.out.println("输入密码：");
        String password = sc.next();
        System.out.println("请输入验证码(" + okCode + ")");
        String code = sc.next();

        if (okCode.equalsIgnoreCase(code)){
            if(name.equals(okName) && okPassword.equals(password)){
                System.out.println("登陆成功！");
            }else {
                System.out.println("用户名或密码错误！");
            }
        }else {
            System.out.println("验证码错误！");
        }


    }
}
