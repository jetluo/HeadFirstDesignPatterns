package com.jetluo.patterns.proxy.jdkproxy;

/**
 * @ClassName Client
 * @Description TODO
 * @Author jet
 * @Date 2022/4/28 22:43
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        //获取代理对象
        //1.创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //2.使用factory对象的方法获取代理对象
        SellTickets proxyObject=  factory.getProxyObject();
        //3. 调用类调用的方法
        proxyObject.sell();

        System.out.println(proxyObject.getClass());

        while (true){

        }
    }
}
