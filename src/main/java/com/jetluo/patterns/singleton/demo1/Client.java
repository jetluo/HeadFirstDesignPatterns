package com.jetluo.patterns.singleton.demo1;

/**
 * @ClassName Clinet
 * @Description TODO
 * @Author jet
 * @Date 2022/4/13 22:38
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton.equals(singleton2));
    }
}
