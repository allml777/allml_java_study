package com.allml.D145;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        //map键值对，键不能重复、值可以重复
        //HashMap 无序 不重复 无索引（用的最多）
        //LinkedHashMap 有序 不重复 无索引
        //TreeMap 按照大小默认升序排序 不重复 无索引
//        Map<String ,Integer > map = new HashMap<>();    //经典代码
        Map<String ,Integer > map = new LinkedHashMap<>();
        map.put("aaa",1);
        map.put("bbb",11);
        map.put("aaa",111);
        map.put("ccc",1111);
        map.put(null,null);

        System.out.println(map);
        System.out.println(map.size());

        Map<Integer ,String  > map1 = new TreeMap<>();    //经典代码
        map1.put(1,"wrdf");
        map1.put(3,"sgsr");
        map1.put(2,"ssddv");
        map1.put(6,"dsfa ");
        map1.put(4,"hguyt");
        System.out.println(map1);
        System.out.println(map1.size());


    }
}
