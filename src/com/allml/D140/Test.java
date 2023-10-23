package com.allml.D140;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        //创建一个set集合
        //set的常用方法基本都是collection的方法
//        Set<Integer> set = new HashSet<>();//经典代码 相当于是set的一个代表集合 无序 不重复 无索引
//        Set<Integer> linkedHashSet = new LinkedHashSet<>();//有序 不重复 无索引
        Set<Integer> linkedHashSet = new TreeSet<>();//排序序 不重复 无索引
//        set.add(666);
//        set.add(666);
//        set.add(666);
//        set.add(111);
//        set.add(223);
//        set.add(345);
//        set.add(444);
//        set.add(555);
        linkedHashSet.add(111);
        linkedHashSet.add(222);
        linkedHashSet.add(111);
        linkedHashSet.add(333);
        linkedHashSet.add(111);
//        System.out.println(set);
        System.out.println(linkedHashSet);
    }
}
