package com.jetluo.patterns.singleton.demo6;

/**
 * @ClassName Client
 * @Description TODO
 * @Author jet
 * @Date 2022/4/13 23:19
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println( instance == instance2);
    }
}
