package com.allml.D133;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) {
        String data =
                "       来黑马程序员学习Java，\n" +
                "       电话:1866668888，18699997777\n" +
                "       或者联系邮箱:boniu@itcast.cn,\n" +
                "       座机电话:01036517895，010-98951256\n" +
                "       邮箱:bozai@itcast.cn,\n " +
                "       邮箱2:dleioo09@163.com，\n " +
                "       热线电话:400-618-9090,400-618-4000,4006184000,4006189090";
        //定义爬取规则（正则表达式）
        String regex = "(\\w{1,}@\\w{2,10}(\\.\\w{2,10}){1,2})|"+"([1][3-9]\\d{9})|([0]\\d{2,7}-?[1-9]\\d{4,19})";
        //把正则表达式封装成一个pattern对象
        Pattern pattern = Pattern.compile(regex);
        //通过pattern对象得到查找内容的匹配器
        Matcher matcher = pattern.matcher(data);
        System.out.println("================");
        //通过匹配器开始去查找信息
        while (matcher.find()){
            //找到就取出信息
            System.out.println(matcher.group());
        }

    }
}
