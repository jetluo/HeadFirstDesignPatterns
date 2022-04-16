package com.jetluo.patterns.singleton.demo9;

import java.io.IOException;

/**
 * @ClassName RuntimeDemo
 * @Description TODO
 * @Author jet
 * @Date 2022/4/16 23:06
 * @Version 1.0
 **/
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("ifconfig");
        byte[] arr = new byte[1024 * 1028 * 1000];
        int len = process.getInputStream()
                .read(arr);
        System.out.println(new String(arr, 0, len, "GBK"));
    }
}
