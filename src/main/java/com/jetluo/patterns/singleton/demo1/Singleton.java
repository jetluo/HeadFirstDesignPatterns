package com.jetluo.patterns.singleton.demo1;

/**
 * @ClassName Singleton
 * @Description 饿汉式-静态变量
 * @Author jet
 * @Date 2022/4/13 22:35
 * @Version 1.0
 **/
public class Singleton {
    //1. 私有构造方法
    private Singleton(){

    }
    //2.本类中创建本类对象
    private static Singleton instance = new Singleton();

    //3.提供一个公共对方法。
    public static Singleton getInstance(){
        return instance;
    }
}
