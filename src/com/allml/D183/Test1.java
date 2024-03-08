package com.allml.D183;

/**
 * 悲观锁
 */
public class Test1 {
    public static void main(String[] args) {
        Runnable rr = new MyRunnable1();

        for (int i = 0; i < 100; i++) {
            new Thread(rr).start();
        }
    }
}
