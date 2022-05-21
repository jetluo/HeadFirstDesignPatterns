package com.jetluo.patterns.proxy.cglibproxy;

/**
 * @ClassName Client
 * @Description TODO
 * @Author jet
 * @Date 2022/5/6 22:37
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        ProxyFactory factory= new ProxyFactory();
        TrainStation proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }
}
