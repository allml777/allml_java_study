package com.allml.D177;

public class ThreadTest {
    public static void main(String[] args) {
        Account acc = new Account("ICBC001", 100000);
        new DrawThread("小明",acc).start();
        new DrawThread("小红",acc).start();

        Account acc2 = new Account("ICBC002", 100000);
        new DrawThread("小黑",acc2).start();
        new DrawThread("小白",acc2).start();
    }
}
