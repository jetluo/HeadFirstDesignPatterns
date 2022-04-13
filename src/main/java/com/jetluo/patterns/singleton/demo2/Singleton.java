package com.jetluo.patterns.singleton.demo2;

/**
 * @ClassName Singleton2
 * @Description 饿汉式-静态代码块
 * @Author jet
 * @Date 2022/4/13 22:43
 * @Version 1.0
 **/
public class Singleton {
    private Singleton(){}
    private  static Singleton instance;
    static {
        instance = new Singleton();
    }
    public static Singleton getInstance(){
        return instance;
    }
}
