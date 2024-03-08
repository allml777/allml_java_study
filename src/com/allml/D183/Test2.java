package com.allml.D183;

/**
 * 乐观锁
 */
public class Test2 {
    public static void main(String[] args) {
        MyRunnable2 rr2 = new MyRunnable2();

        for (int i = 0; i < 100; i++) {
            new Thread(rr2).start();
        }
    }
}
