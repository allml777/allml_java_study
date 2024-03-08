package com.allml.D183;

import com.allml.D180.MyRunnable;

public class MyRunnable1 implements Runnable {
    private int count;


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (MyRunnable1.class) {
                System.out.println("count============>" + (++count));
            }
        }
    }
}
