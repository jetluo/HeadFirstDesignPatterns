package com.jetluo.patterns.factory.method;

/**
 * @ClassName Client
 * @Description 工厂模式
 * @Author jet
 * @Date 2022/4/10 22:47
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        store.setFactory(new LatterCoffeeFactory());
        Coffee coffee =  store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
