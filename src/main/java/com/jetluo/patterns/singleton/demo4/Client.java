package com.jetluo.patterns.singleton.demo4;

/**
 * @ClassName Client
 * @Description
 *
 * @Author jet
 * @Date 2022/4/13 23:13
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton == singleton2);
    }
}
