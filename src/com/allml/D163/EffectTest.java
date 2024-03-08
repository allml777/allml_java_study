package com.allml.D163;

import java.io.*;

public class EffectTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

//        copy01();
//        copy02();
//        copy03();
        copy04();

        long endTime = System.currentTimeMillis();

        System.out.println("运行时间为(ms):" + (endTime - startTime));
    }


    //原始字符流
    private static void copy01() {
        try (
                FileInputStream fi1 = new FileInputStream("src\\com\\allml\\D163\\20.4-定时器中断实验--定时计数器工作方式.mp4");
                FileOutputStream fo1 = new FileOutputStream("src\\com\\allml\\D163\\20.4-定时器中断实验--定时计数器工作方式bak.mp4");
        ) {
            int len;
            while ((len = fi1.read()) != -1) {
                fo1.write(len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //字节缓存流
    private static void copy02() {
        try (
                FileInputStream fi1 = new FileInputStream("src\\com\\allml\\D163\\20.4-定时器中断实验--定时计数器工作方式.mp4");
                FileOutputStream fo1 = new FileOutputStream("src\\com\\allml\\D163\\20.4-定时器中断实验--定时计数器工作方式bak.mp4");
        ) {
            int len;
            byte[] buffer = new byte[1024];
            while ((len = fi1.read(buffer)) != -1) {
                fo1.write(buffer, 0, len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //字节缓冲流
    private static void copy03() {
        try (
                BufferedInputStream fi1 = new BufferedInputStream(new FileInputStream("src\\com\\allml\\D163\\20.4-定时器中断实验--定时计数器工作方式.mp4"));
                BufferedOutputStream fo1 = new BufferedOutputStream(new FileOutputStream("src\\com\\allml\\D163\\20.4-定时器中断实验--定时计数器工作方式bak.mp4"));
        ) {
            int len;
            while ((len = fi1.read()) != -1) {
                fo1.write(len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //字节缓冲流
    private static void copy04() {
        try (
                BufferedInputStream fi1 = new BufferedInputStream(new FileInputStream("src\\com\\allml\\D163\\20.4-定时器中断实验--定时计数器工作方式.mp4"));
                BufferedOutputStream fo1 = new BufferedOutputStream(new FileOutputStream("src\\com\\allml\\D163\\20.4-定时器中断实验--定时计数器工作方式bak.mp4"));
        ) {
            int len;
            byte[] buffer = new byte[1024];
            while ((len = fi1.read(buffer)) != -1) {
                fo1.write(len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
