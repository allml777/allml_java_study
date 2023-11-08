package com.allml.D149;

import java.util.*;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "张无忌", "赵敏", "小昭", "张三", "杨过");
        Stream<String> stream = names.stream();

        Set<String> set = new HashSet<>();
        Collections.addAll(set, "黑色素", "事实上", "试试看的", "奥兰多", "舒服的", "撒全球");
        Stream<String> stream1 = set.stream();
        stream1.filter(s->s.contains("的")).forEach(s -> System.out.println(s));


        Map<String,Double> map = new HashMap<>();
        map.put("van",188.8);
        map.put("bili",187.0);
        map.put("monan",185.4);
        map.put("boy",175.1);
        map.put("banana",190.4);

        Set<String> keys = map.keySet();
        Stream<String> ks = keys.stream();

        Collection<Double> values = map.values();
        Stream<Double> vs = values.stream();

        Set<Map.Entry<String, Double>> entries = map.entrySet();
        Stream<Map.Entry<String, Double>> kvs = entries.stream();
        kvs.filter(e-> e.getKey().contains("b")).forEach(e-> System.out.println("key:"+e.getKey()+"\t\tvalue:"+e.getValue()));

        String[] names2 = {"的方式","的萨芬","个别地方","阿斯顿","饿啊分","阿三的","和广泛的"};
        Stream<String> stream2 = Arrays.stream(names2);
        Stream<List<String>> stream3 = Stream.of(names);
    }
}
