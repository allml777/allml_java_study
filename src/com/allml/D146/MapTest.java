package com.allml.D146;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapTest {
    public static void main(String[] args) {
        //准备一个map集合
        Map<String, Double> map = new HashMap<>();
        map.put("zzz", 166.6);
        map.put("zzz", 168.9);
        map.put("van", 188.9);
        map.put("bili", 187.3);
        map.put("boy", 182.3);

        System.out.println(map);//{van=188.9, bili=187.3, zzz=168.9, boy=182.3}

        //键找值
        //1.获取Map全部的键
        Set<String> keys = map.keySet();
        System.out.println(keys);

        //2.遍历全部的键根据键获取对应的值
        for (String key : keys) {
            Double value = map.get(key);
            System.out.println(key + " \t==> " + value);
        }

        //键值对遍历 entrySet
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            String key = entry.getKey();
            double value = entry.getValue();
            System.out.println(key + " \t==> " + value);
        }

        //Lambda表达式遍历
//        map.forEach((k,v)->{
//            System.out.println(k + " \t===> " + v);
//        });

        map.forEach((s, aDouble) -> {
            System.out.println(s + " \t===> " + aDouble);
        });

    }
}
