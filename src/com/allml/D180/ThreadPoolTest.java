package com.allml.D180;

import java.util.concurrent.*;

public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(3,5,8, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        //1. 实现runnable
//        Runnable target = new MyRunnable();
//
//        //先占3个核心线程
//        pool.execute(target);//线程池会自动创建一个新线程
//        pool.execute(target);//线程池会自动创建一个新线程
//        pool.execute(target);//线程池会自动创建一个新线程
//
//        //占了4个任务队列
//        pool.execute(target);//线程池会自动创建一个新线程
//        pool.execute(target);//线程池会自动创建一个新线程
//        pool.execute(target);//线程池会自动创建一个新线程
//        pool.execute(target);//线程池会自动创建一个新线程
//
//        //打开两个临时线程
//        pool.execute(target);//线程池会自动创建一个新线程
//        pool.execute(target);//线程池会自动创建一个新线程
//
//        //抛异常
//        pool.execute(target);//线程池会自动创建一个新线程
//
////        pool.shutdown();
////        pool.shutdownNow();

        //2.实现callable
        Future<String> f1 = pool.submit(new MyCallable(5));
        Future<String> f2 = pool.submit(new MyCallable(6));
        Future<String> f3 = pool.submit(new MyCallable(7));
        Future<String> f4 = pool.submit(new MyCallable(8));
        Future<String> f5 = pool.submit(new MyCallable(9));

        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
            System.out.println(f4.get());
            System.out.println(f5.get());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            pool.shutdown();
        }

    }
}
