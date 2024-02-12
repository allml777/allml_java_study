package com.allml.D153;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileTest2 {
    public static void main(String[] args) {
        // 1 创建文件对象，代指某个文件
        File f1 = new File("src/com/allml/D152/ab.txt");
        // 2 判断文件对象是否存在
        System.out.println(f1.exists());
        // 3 判断当前对象是否是文件
        System.out.println(f1.isFile());
        // 4 判断当前文件对象指代的是否是文件夹
        System.out.println(f1.isDirectory());
        // 5 获取文件的名称
        System.out.println(f1.getName());
        // 6 获取文件的大小
        System.out.println(f1.length());
        // 7 获取文件的最后修改时间，获取的是时间戳(Long类型)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(f1.lastModified()));
        // 8 获取创建文件对象时使用的路径
        System.out.println(f1.getPath());
        // 9 获取绝对路径
        System.out.println(f1.getAbsoluteFile());
    }
}
