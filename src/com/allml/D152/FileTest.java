package com.allml.D152;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
//        File f = new File("C:\\Users\\阿良良木亮\\IdeaProjects\\allml_java_study\\src\\com\\allml\\D152\\ab.txt");
        //File.separator会根据不同系统选分隔符
//        File f = new File("C:" + File.separator + "Users" + File.separator + "阿良良木亮" + File.separator + "IdeaProjects" + File.separator + "allml_java_study"
//                + File.separator + "src" + File.separator + "com" + File.separator + "allml" + File.separator + "D152" + File.separator + "ab.txt");
        //相对路径从src开始，不然就照不到文件了
        File f = new File("src\\com\\allml\\D152\\ab.txt");
        System.out.println(f.exists());
        System.out.println(f.length());
    }
}
