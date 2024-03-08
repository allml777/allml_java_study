package com.allml.D183;

import java.util.concurrent.atomic.AtomicInteger;

public class MyRunnable2 implements Runnable {
    private AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //count.incrementAndGet相当于++count
            System.out.println("count============>" + count.incrementAndGet());
        }
    }
}
