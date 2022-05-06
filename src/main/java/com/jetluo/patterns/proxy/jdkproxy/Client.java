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
        SellTickets proxyObject=  factory.getProxyObject();
        proxyObject.sell();
    }
}
