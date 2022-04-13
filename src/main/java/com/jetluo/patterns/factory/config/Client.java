package com.jetluo.patterns.factory.config;

/**
 * @ClassName Clinet
 * @Description TODO
 * @Author jet
 * @Date 2022/4/11 23:58
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Coffee coffee =   CoffeeFactory.createCoffee("latter");
        System.out.println(coffee.getName());

        Coffee american =   CoffeeFactory.createCoffee("american");
        System.out.println(american.getName());
    }
}
