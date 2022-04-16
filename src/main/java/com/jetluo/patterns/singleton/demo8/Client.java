package com.jetluo.patterns.singleton.demo8;


import java.lang.reflect.Constructor;

/**
 * @ClassName Client
 * @Description 反射破坏单例模式
 * @Author jet
 * @Date 2022/4/13 23:13
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) throws Exception {

        Class clazz = Singleton.class;
        Constructor cons = clazz.getDeclaredConstructor();
        cons.setAccessible(true);
        Singleton singleton = (Singleton) cons.newInstance();
        Singleton singleton2 = (Singleton) cons.newInstance();
        System.out.println(singleton == singleton2);


    }


}
