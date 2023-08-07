package practice20230609;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==================ATM=====================");
            System.out.println("1. 登录");
            System.out.println("2. 注册");

            System.out.println("选择操作: ");
            int command = sc.nextInt();

            switch (command) {
                case 1:
                    login(accounts, sc);
                    break;
                case 2:
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("ERROR COMMAND");
                    break;
            }
        }
    }

    /**
     * 登录功能
     *
     * @param accounts
     * @param sc
     */
    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("===================登 录=====================");
        if (accounts.size() == 0) {
            System.out.println("当前系统中无任何账户");
            return;
        }
        while (true) {
            System.out.println("请输入登录卡号");
            String cardId = sc.next();
            Account acc = getAccountByCardId(cardId, accounts);

            if (acc != null) {
                while (true) {
                    System.out.println("请输入登录密码");
                    String passWord = sc.next();
                    if (acc.getPassWord().equals(passWord)) {
                        System.out.println(acc.getUserName() + ",进入系统，您的卡号是" + acc.getCardId());
                        showUserCommand(acc, sc);
                        return;
                    } else {
                        System.out.println("你的密码有问题");
                    }
                }
            } else {
                System.out.println("没这个卡号");
            }
        }
    }

    /**
     * 登陆后的操作页
     */
    private static void showUserCommand(Account acc, Scanner sc) {
        while (true) {
            System.out.println("===============操作页=================");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、修改密码");
            System.out.println("6、退出");
            System.out.println("7、注销");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    showAccount(acc);
                    break;
                case 2:
                    depositMonet(acc, sc);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("退出成功");
                    return;
                case 7:

                    break;
                default:
                    System.out.println("输入的操作有误");
                    break;
            }
        }
    }

    /**
     * 存钱
     *
     * @param acc
     */
    private static void depositMonet(Account acc, Scanner sc) {
        System.out.println("==================存钱========================");
        System.out.println("输入存钱金额：");
        Double Money = sc.nextDouble();

        acc.setMoney(acc.getMoney() + Money);
        System.out.println("存钱成功，账户信息如下");
        showAccount(acc);
    }

    /**
     * 展示账户信息
     *
     * @param acc
     */
    private static void showAccount(Account acc) {
        System.out.println("==================账户信息=======================");
        System.out.println("卡号：" + acc.getCardId());
        System.out.println("用户名：" + acc.getUserName());
        System.out.println("余额：" + acc.getMoney());
        System.out.println("限额：" + acc.getQuotaMoney());
    }


    /**
     * 用户开户
     *
     * @param accounts
     */
    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("==================开 户=====================");
        Account account = new Account();

        System.out.println("请您输入用户名：");
        String userName = sc.next();
        account.setUserName(userName);

        while (true) {
            System.out.println("请您输入密码：");
            String passWord = sc.next();
            System.out.println("请确认您输入密码：");
            String okPassWord = sc.next();
            if (passWord.equals(okPassWord)) {
                account.setPassWord(passWord);
                break;
            } else {
                System.out.println("两次密码不一致，请重新确认");
            }
        }

        System.out.println("请您输入账户限额：");
        Double quotamoney = sc.nextDouble();
        account.setQuotaMoney(quotamoney);

        /**
         * 随机一个8位不重复号码
         */
        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);

        accounts.add(account);
        System.out.println(userName + "成功开户，您的卡号是：" + cardId);

    }

    private static String getRandomCardId(ArrayList<Account> accounts) {
        Random r = new Random();
        while (true) {
            String cardId = "";

            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);
            }

            Account acc = getAccountByCardId(cardId, accounts);
            if (acc == null) {
                return cardId;
            }
        }
    }

    /**
     * 根据卡号查账户对象
     *
     * @param cardId
     * @param accounts
     * @return Account
     */

    private static Account getAccountByCardId(String cardId, ArrayList<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null;
    }
}
