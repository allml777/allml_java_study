package com.allml.D128;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        String[] names = {"aaa","Bb","ccc","sdf","ssfw","hjgf"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        //忽略首字符大小写排序
//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                //指定比较规则
//                return o1.compareToIgnoreCase(o2);
//            }
//        });

        //特定类型的方法引用
        //Arrays.sort(names,(o1,o2)-> o1.compareToIgnoreCase(o2));
        Arrays.sort(names,String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));

    }
}
