package com.jetluo.patterns.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyFactory
 * @Description TODO
 * @Author jet
 * @Date 2022/4/26 22:44
 * @Version 1.0
 **/
public class ProxyFactory {
    public TrainStation station= new TrainStation();

    /**
     * @Author jet
     * @Description 获取代理对象的方法
     * @Date 2022/4/28
     * @Param []
     * @return com.jetluo.patterns.proxy.jdkproxy.SellTickets
     **/
    public SellTickets getProxyObject(){
        /*
         *ClassLoader loader, 类加载器，用于加载代理类，
         * 可以通过目标对象获取类加载器
          Class<?>[] interfaces； 代理类实现的接口的字节码对象
          InvocationHandler h；代理对象的调用处理程序
         *
         **/
       SellTickets proxyObject =  (SellTickets)Proxy.newProxyInstance(
               station.getClass().getClassLoader(),
               station.getClass().getInterfaces(),
               new InvocationHandler() {
                   /*
                    * Object proxy : 代理对象，和proxyObject对象是同一个对象，在invoke方法中基本不用
                    * Method method： 对接口中的方法镜像封装的method对象
                    * Object[] args： 调用方法的实际参数
                    * 返回值就是方法的返回值
                    **/
                   @Override
                   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                       System.out.println("代售点收取服务费用，jdk");
                       Object obj= method.invoke(station, args);
                       return obj;
                   }
               }
       );
       return  proxyObject;
    }
}
