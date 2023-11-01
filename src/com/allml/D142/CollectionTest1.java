package com.allml.D142;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("在这种");
        list.add("待施工");
        list.add("士是夫");
        list.add("是法国");
        list.add("全网通");
        list.add("士大夫");
        list.add("士大是");
        System.out.println(list);

//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String name = it.next();
//            if (name.contains("士")){
//                list.remove(name);
//            }
//        }
//
//        System.out.println(list);

        //遍历集合并删除会有bug，因为数组在变小，可能会删不干净
//        for (int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            if (name.contains("士")){
//                list.remove(name);
//            }
//        }
//        System.out.println(list);

//        System.out.println("----------------------------");
//        for (int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            if (name.contains("士")) {
//                list.remove(name);
//                //防止删不干净
//                i--;
//            }
//        }
//        System.out.println(list);

        //从后往前遍历也能实现正常删除

        //用迭代器实现
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String name = it.next();
            if (name.contains("士")){
//                list.remove(name);//并发修改异常
                it.remove();//删除迭代器当前遍历到的数据，每删除一个数据后，相当于也在底层做了i--
            }
        }
        System.out.println(list);


    }
}
