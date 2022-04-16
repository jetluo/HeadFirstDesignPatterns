package com.jetluo.patterns.singleton.demo8;


import java.io.Serializable;

/**
 * @ClassName Singleton
 * @Description  ✨✨✨✨✨推荐使用 线程安全 懒汉式-静态内部类方式
 *   线程安全的，而且也保证了Singleton类的唯一性
 * @Author jet
 * @Date 2022/4/13 23:10
 * @Version 1.0
 **/
public class Singleton  {
    private static boolean flag = false;

    private  Singleton(){
        synchronized ( Singleton.class) {
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }
    }


    private  static  class  SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();

    }

    public static  Singleton getInstance(){
        return Singleton.SingletonHolder.INSTANCE;
    }

}
