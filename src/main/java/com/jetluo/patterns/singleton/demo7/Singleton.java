package com.jetluo.patterns.singleton.demo7;


import java.io.Serializable;

/**
 * @ClassName Singleton
 * @Description  ✨✨✨✨✨推荐使用 线程安全 懒汉式-静态内部类方式
 *   线程安全的，而且也保证了Singleton类的唯一性
 * @Author jet
 * @Date 2022/4/13 23:10
 * @Version 1.0
 **/
public class Singleton implements Serializable {
    private Singleton(){}

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();

    }

    public static Singleton getInstance(){
        return Singleton.SingletonHolder.INSTANCE;
    }
    /**
     * @Author jet
     * @Description //当进行反序列化时，会自动调用该方法，将该方法的返回值直接返回
     * @Date 2022/4/14
     * @Param []
     * @return java.lang.Object
     **/
    public  Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}
