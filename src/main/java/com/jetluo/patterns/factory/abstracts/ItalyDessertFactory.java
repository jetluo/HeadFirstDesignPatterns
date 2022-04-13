package com.jetluo.patterns.factory.abstracts;

/**
 * @ClassName AmericanDessertFactory
 * @Description 意大利工厂
 * @Author jet
 * @Date 2022/4/11 23:21
 * @Version 1.0
 **/
public class ItalyDessertFactory implements  DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatterCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
