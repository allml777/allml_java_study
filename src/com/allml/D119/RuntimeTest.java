package com.allml.D119;

//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.IOException;

public class RuntimeTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        //runtime 是单例类
        Runtime r = Runtime.getRuntime();
        //终止当前虚拟机
//        r.exit(0);
        //获取虚拟机能够使用的处理器数
        System.out.println(r.availableProcessors());
        //返回java虚拟机中的内存总量
        System.out.println(r.totalMemory()/1024.0/1024.0);
        //返回java虚拟机中可用的内存量
        System.out.println(r.freeMemory()/1024.0/1024.0);
        //用来启动某个程序
//        Process p = r.exec("D:\\ARDC\\ARDC.exe");
//        r.exec("cmd.exe");
//        Thread.sleep(5000);
//        p.destroy();
    }
}
