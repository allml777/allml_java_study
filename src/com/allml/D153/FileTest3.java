package com.allml.D153;

import java.io.File;
import java.io.IOException;

public class FileTest3 {
    public static void main(String[] args) throws IOException {
        // 1 创建一个新文件
        File f1 = new File("src/com/allml/D152/abc.txt");
        System.out.println(f1.createNewFile());

        // 2 创建一个文件夹（mkdir只能创建一级文件夹，mkdirs能创建多级文件夹）
        File f2 = new File("src/com/allml/D153/aaa/bbb/ccc");
        System.out.println(f2.mkdirs());

        // 3 删除文件或空文件夹
        System.out.println(f1.delete());
    }
}
