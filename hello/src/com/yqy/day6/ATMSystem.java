package com.yqy.day6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 * ATM系统入口类
 */
public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("---------ATM系统---------");
            System.out.println("1.账户登录");
            System.out.println("2.账户开户");
            System.out.println("请输入选择操作：");
            int command = sc.nextInt();

            switch (command){
                case 1:
                    login(accounts,sc);
                    break;
                case 2:
                    register(accounts,sc);
                    break;
                default:
                    System.out.println("输入的命令有误！");
            }
        }
    }


    /**
     * 登陆功能
     * @param accounts  全部对象的集合
     * @param sc    扫描器
     */
    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("=========系统登陆操作==========");
        if (accounts.size() == 0) {
            System.out.println("当前系统中无任何账户");
            return;
        }

        while (true) {
            System.out.println("请输入登陆卡号：");
            String cardId = sc.next();
            Account acc = getAccountByCardId(cardId, accounts);
            if (acc != null) {
                while (true) {
                    System.out.println("请输入密码：");
                    String passWord = sc.next();
                    if (passWord.equals(acc.getPassWord())){
                        System.out.println(acc.getUserName() + "登陆成功！");
                        showUserCommand(sc,acc,accounts);
                        return; //结束登陆方法
                    }else {
                        System.out.println("输入密码有误！");
                    }
                }
            } else {
                System.out.println("系统中不存在该账户！");
            }
        }
    }


    /**
     * 展示登陆后的操作
     * @param sc   扫描器
     * @param acc  传入账户
     */
    private static void showUserCommand(Scanner sc, Account acc, ArrayList<Account> accounts) {
        while (true) {
            System.out.println("==========用户操作页==========");
            System.out.println("请选择操作：");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销账户");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    //查询账户
                    showAccount(acc);
                    break;
                case 2:
                    //存款
                    depositMoney(acc,sc);
                    break;
                case 3:
                    //取款
                    withDrawMoney(acc,sc);
                    break;
                case 4:
                    transferMoney(acc,sc,accounts);
                    //转账
                    break;
                case 5:
                    //密码修改
                    updatePassWord(sc,acc);
                    return;
                case 6:
                    //退出
                    System.out.println("退出成功！");
                    return; //结束当前命令方法
                case 7:
                    //注销账户
                    System.out.println("确认销户？Y/N");
                    String rs = sc.next();
                    switch (rs){
                        case "Y":
                            accounts.remove(acc);
                            System.out.println("销户成功！");
                            return;
                    }
                    break;
                default:
                    System.out.println("输入的指令有误！");

            }
        }

    }

    /**
     * 用户修改密码的方法
     * @param sc    传入扫描器
     * @param acc   传入当前用户对象
     */
    private static void updatePassWord(Scanner sc, Account acc) {
        System.out.println("========修改密码========");
        while (true) {
        System.out.println("请输入当前密码：");
        String passWord = sc.next();
            if (passWord.equals(acc.getPassWord())) {
                while (true) {
                    System.out.println("请输入新密码：");
                    String newPassWord = sc.next();
                    System.out.println("请确认新密码：");
                    String newPassword1 = sc.next();
                    if (newPassWord.equals(newPassword1)){
                        acc.setPassWord(newPassWord);
                        System.out.println("密码修改成功！");
                        return;//结束修改密码的方法
                    }else {
                        System.out.println("两次输入的密码不一致！");
                    }
                }
            }else {
                System.out.println("密码输入错误！");
            }
        }
    }

    /**
     * 用户转账功能
     * @param acc   传入当前用户对象
     * @param sc    传入扫描器
     * @param accounts  传入所有用户对象
     */
    private static void transferMoney(Account acc, Scanner sc, ArrayList<Account> accounts) {
        System.out.println("==========转账=========");
        if (accounts.size()<2){
            System.out.println("当前系统中小于两个账户无法转账！");
            return; //结束转账方法
        }
        if (acc.getMoney() == 0){
            System.out.println("账户余额为0");
            return;
        }
        while (true) {
            System.out.println("请输入要转账账户的卡号：");
            String cardID = sc.next();

            if (cardID.equals(acc.getCardId())){
                System.out.println("不可以输入自己的卡号！");
                continue; //结束当次循环，进入下一次循环
            }

            Account account = getAccountByCardId(cardID, accounts);
            if (account == null){
                System.out.println("输入的卡号不存在！");
            }else {
                String userName = account.getUserName();
                String tip = "*" + userName.substring(1);
                System.out.println("请输入" + tip + "的姓氏");
                String preName = sc.next();
                if (userName.startsWith(preName)){
                    while (true) {
                        System.out.println("请输入转账金额：");
                        double money = sc.nextDouble();
                        if (money > acc.getMoney()){
                            System.out.println(acc.getMoney() + "余额不足，转账失败！");
                        }else {
                            acc.setMoney(acc.getMoney() - money);
                            account.setMoney(account.getMoney() + money);
                            System.out.println("转账成功！");
                            showAccount(acc);
                            return;//结束转账方法
                        }
                    }
                }else {
                    System.out.println("输入的信息有误！");
                }
            }
        }
    }


    /**
     * 用户取款操作
     * @param acc   传入当前操作用户对象
     * @param sc    传入扫描器
     */
    private static void withDrawMoney(Account acc, Scanner sc) {
        System.out.println("========取款=======");
        System.out.println("当前账户余额：" + acc.getMoney());
        if (acc.getMoney()<100){
            System.out.println("当前账户余额不足100！");
            return;//结束当前取款方法
        }
        while (true) {
            System.out.println("请输入要取款的金额：");
            double money = sc.nextDouble();
            if (money > acc.getQuotaMoney()){
                System.out.println("当前取款超过限额：" + acc.getQuotaMoney());
            }else {
                if (money > acc.getMoney()){
                    System.out.println("余额不足！");
                }else {
                    acc.setMoney(acc.getMoney() - money);
                    System.out.println("取款" + money + "成功！");
                    showAccount(acc);
                    return;//结束取钱方法
                }
            }
        }
    }

    /**
     * 用户存款功能
     * @param acc   传入当前登陆用户信息
     * @param sc    传入扫描器
     */
    private static void depositMoney(Account acc, Scanner sc) {
        System.out.println("======存款======");
        System.out.println("请输入要存款的金额：");
        double money = sc.nextDouble();
        acc.setMoney(acc.getMoney() + money);
        System.out.println("存款成功！当前账户信息如下：");
        showAccount(acc);
    }


    /**
     * 展示账户信息
     * @param acc
     */
    private static void showAccount(Account acc) {
        System.out.println("==========当前账户信息如下==========");
        System.out.println("用户名：" + acc.getUserName());
        System.out.println("卡号：" + acc.getCardId());
        System.out.println("余额：" + acc.getMoney());
        System.out.println("限额：" + acc.getQuotaMoney());
    }

    /**
     * 用户开户功能的实现
     * @param accounts  接收的账户集合
     */
    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("========开户========");
        Account account = new Account();
        System.out.println("请输入用户名：");
        String userName = sc.next();
        account.setUserName(userName);

        while (true) {
            System.out.println("请输入账户密码：");
            String passWord = sc.next();
            System.out.println("请输入确认密码：");
            String okPassWord = sc.next();
            if (passWord.equals(okPassWord)){
                account.setPassWord(passWord);
                break;
            }else {
                System.out.println("输入的两次密码不一致!");
            }
        }
        System.out.println("请输入账户限额：");
        double quotaMoney = sc.nextDouble();
        account.setQuotaMoney(quotaMoney);

        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);

        accounts.add(account);
        System.out.println("开户成功！");
        System.out.println("用户名：" + userName);
        System.out.println("账户：" + cardId);
        System.out.println("密码：" + account.getPassWord());
    }


    /**
     * 为账户生成8位与其他卡号不重复的卡号
     * @return  返回生成的卡号
     */
    private static String getRandomCardId(ArrayList<Account> accounts) {
        Random r = new Random();
        while (true) {
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);
            }
            Account acc = getAccountByCardId(cardId,accounts);
            if (acc == null){
                return cardId;
            }
        }
    }


    /**
     * 根据卡号查询出一个账户对象
     * @param careID    卡号
     * @param accounts  全部账户的集合
     * @return  账户对象|null
     */
    private static Account getAccountByCardId(String careID, ArrayList<Account> accounts){
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(careID)){
                return acc;
            }
        }
        return null;
    }

}
