package com.allml.D137;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("ashuifh");
        c.add("sfafs");
        c.add("xczvadf");
        c.add("saav");
        c.add("uigot");
        System.out.println(c);

        for(String e : c){
            System.out.println(e);
        }

        Iterator<String> it = c.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());

        //循环结合迭代器
        while (it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
        }
    }
}
