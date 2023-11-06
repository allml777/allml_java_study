package com.allml.D146;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //1.把80个学生选择的数据拿到程序中来
        List<String> data = new ArrayList<>();
        String[] selects = {"A", "B", "C", "D"};
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(4);//包前不包后 0 1 2 3
            data.add(selects[index]);
        }
        System.out.println(data);

        //准备一个map来统计结果
        Map<String, Integer> result = new HashMap<>();
        for (String str : data) {
            if (result.containsKey(str)) {
                result.put(str, result.get(str) + 1);
            } else {
                result.put(str, 1);
            }
        }

        System.out.println(result);


    }
}
