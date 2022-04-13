package com.jetluo.patterns.singleton.demo3;

/**
 * @ClassName Singleton
 * @Description 懒汉式 ✨✨✨✨✨推荐使用 线程安全 双重检查式 ✨✨✨✨✨
 *  如果没有volatile，在多线程情况下，可能出现空指针问题
 *  出现问题的原因是jvm在实例化对象的时候会进行优化和指令重排序操作。
 * @Author jet
 * @Date 2022/4/13 22:46
 * @Version 1.0
 **/
public class Singleton {
    private Singleton(){}
    // 使用volatile关键字来保证在多线程情况下的可见性和有序性
    private static volatile Singleton instance;

    public static  Singleton getInstance(){
        if (instance == null) {
            synchronized (Singleton.class){
                if ( instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
