package com.allml.D149;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        /*
        筛选姓张的3个字的人
         */
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "张无忌", "赵敏", "小昭", "张三", "杨过");

        //用stream的写法
        List<String> list = names.stream().filter(s -> s.startsWith("张") && s.length() == 3).collect(Collectors.toList());
        System.out.println(list);
    }
}
