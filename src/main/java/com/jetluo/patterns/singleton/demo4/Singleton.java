package com.jetluo.patterns.singleton.demo4;

/**
 * @ClassName Singleton
 * @Description  ✨✨✨✨✨推荐使用 线程安全 懒汉式-静态内部类方式
 *   线程安全的，而且也保证了Singleton类的唯一性
 * @Author jet
 * @Date 2022/4/13 23:10
 * @Version 1.0
 **/
public class Singleton {
    private Singleton(){}

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();

    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
