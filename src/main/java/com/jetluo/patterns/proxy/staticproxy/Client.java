package com.jetluo.patterns.proxy.staticproxy;

/**
 * @ClassName Client
 * @Description TODO
 * @Author jet
 * @Date 2022/4/26 22:39
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
