package com.jetluo.patterns.singleton.demo3;

/**
 * @ClassName Client
 * @Description T
 * @Author jet
 * @Date 2022/4/13 22:50
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton.equals(singleton2));
    }
}
