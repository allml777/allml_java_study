package com.allml.D153;

import java.io.File;

public class FileTest4 {
    public static void main(String[] args) {
        // 1 获取文件夹的一级文件名称并返回
        File f1 = new File("D:\\STL_FILE");
        String[] names = f1.list();
        for (String name : names) {
//            System.out.println(name);
        }

        // 2 获取当前目录下所有一级文件对象到一个文件对象的数组中返回
        File[] files = f1.listFiles();
        for (File file : files) {
//            System.out.println(file.getAbsoluteFile());
        }

        FileRecursion("C:\\Users\\阿良良木亮\\Downloads\\IKEA_STL");


    }
    // 3 递归

    private static boolean FileRecursion(String path) {
        File f1 = new File(path);
        System.out.println(f1.getAbsolutePath());
        if (f1.isFile()) {
            return false;
        } else {
            File[] names = f1.listFiles();
            for (File name : names) {
                FileRecursion(name.getAbsolutePath());
            }
        }
        return true;
    }

}
