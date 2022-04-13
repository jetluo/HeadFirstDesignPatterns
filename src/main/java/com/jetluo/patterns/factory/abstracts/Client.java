package com.jetluo.patterns.factory.abstracts;

/**
 * @ClassName Client
 * @Description TODO
 * @Author jet
 * @Date 2022/4/11 23:24
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        DessertFactory factory = new AmericanDessertFactory();
        Coffee coffee= factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
