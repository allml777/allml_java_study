package com.allml.D127;

public class TestLambda {
    public static void main(String[] args) {
        //Lambda用于简化匿名内部类
        //常规的匿名内部类写法
//        Animal a = new Animal() {
//
//            @Override
//            public void run() {
//                System.out.println("fast");
//            }
//        };

        //Lambda表达式并不能简化全部匿名内部类，只能简化函数式接口的匿名内部类
        //animal是类 不是接口
//        Animal a = ()->{
//            System.out.println("fast");
//        }



//        Swimming swimming = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("happy swim");
//            }
//        };

        //（）中填形参
        Swimming swim = ()->{
            System.out.println("happy swim");
        };

        swim.swim();

        //Lambda表达式的简化
        /*
        1、参数类型可以不写 比如int、double。。。。
        2、只有一个参数时，小括号也可以省略
        3、Lambda表达式的方法体只有一行代码时，可以省略大括号不写，同时省略分号";"，如果这行代码是return语句，也必须去掉return。
         */

    }
}

abstract class Animal{
    public abstract void run();
}

//函数式接口只能有一个抽象方法，一般用@FunctionalInterface注释标记
@FunctionalInterface
interface Swimming{
    void swim();
}
