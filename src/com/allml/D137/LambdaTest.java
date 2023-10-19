package com.allml.D137;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class LambdaTest {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("ashuifh");
        c.add("sfafs");
        c.add("xczvadf");
        c.add("saav");
        c.add("uigot");
        System.out.println(c);

        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //各种lambda表达式写法

        c.forEach((String s) -> {
            System.out.println(s);
        });

        System.out.println("--------------");

        c.forEach(s -> System.out.println(s));

        c.forEach(System.out::println);
    }
}
