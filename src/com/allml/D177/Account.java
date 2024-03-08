package com.allml.D177;

public class Account {
    private String cardId;
    private double money;

    public Account() {
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public void drawMoney(double v) {
        String st = Thread.currentThread().getName();
        System.out.println("取钱的是：" + st);
        //同步代码块
        //this正好代表这个唯一对象
        synchronized (this) {
            if (v <= money) {
                System.out.println(st + "取了" + v + "元");
                this.money -= v;
                System.out.println(st + "取钱后，剩余：" + money);
            } else {
                System.out.println(st + "来取钱，余额不足");
            }
        }
    }

    //静态方法如何使用代码块，建议用class作为锁
    //静态方法如果用this调资源相当于没法同步了
    public static void sss(){
        synchronized (Account.class){

        }
    }
}
