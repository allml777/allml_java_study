package com.allml.D148;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String,List<String>> map = new HashMap<>();
        List<String> cities1 = new ArrayList<>();
        List<String> cities2 = new ArrayList<>();
        Collections.addAll(cities1,"常熟","苏州","南京","无锡");
        Collections.addAll(cities2,"芜湖","合肥","蚌埠");
        map.put("江苏省",cities1);
        map.put("安徽省",cities2);
        System.out.println(map);

    }
}
