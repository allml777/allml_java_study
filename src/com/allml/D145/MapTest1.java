package com.allml.D145;

import java.util.*;

public class MapTest1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();    //经典代码
        map1.put(1, "wrdf");
        map1.put(3, "sgsr");
        map1.put(2, "ssddv");
        map1.put(6, "dsfa ");
        map1.put(4, "hguyt");

//        System.out.println(map1);
//        map1.clear();
        System.out.println(map1);

        System.out.println(map1.isEmpty());

        System.out.println(map1.get(3));
        System.out.println(map1.get(6676));//键不存在会返回null

        System.out.println(map1.remove(2));
        System.out.println(map1);

        System.out.println(map1.containsKey(3));
        System.out.println(map1.containsKey(2));

        System.out.println(map1.containsValue("sgsr"));

        Set<Integer> keys = map1.keySet();
        System.out.println(keys);

        Collection<String> cc = map1.values();
        System.out.println(cc);


        Map<Integer, String> map2 = new HashMap<>();
        map2.put(34,"sbfhjshv");
        map2.put(33,"sbdahv");

        map1.putAll(map2);
        System.out.println(map1);

    }
}
