package com.allml.D136;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionTest2API {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("java1");
        c.add("java1");
        c.add("java2");
        c.add("java3");
        c.add("java1");
        c.add("java4");

        System.out.println(c);
        System.out.println(c.size());
        System.out.println(c.contains("java1"));
        c.remove("java1");//有多个匹配删第一个
        Object[] arr = c.toArray();//把集合转成数组
        System.out.println(Arrays.toString(arr));
        String[] arr2 = c.toArray(new String[c.size()]);//把集合转成String类型的数组
        System.out.println(Arrays.toString(arr2));
        System.out.println(c);
        c.clear();
        System.out.println(c);

        System.out.println(c.isEmpty());

        //把一个集合的全部数据导入另一个集合
        System.out.println("--------------------");
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("java3");
        c2.add("java4");
        c1.addAll(c2);//把c2数据添加到c1中去，c2中还保留原来的数据
        System.out.println(c1);
    }
}
