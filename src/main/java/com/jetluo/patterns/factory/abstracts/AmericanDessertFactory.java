package com.jetluo.patterns.factory.abstracts;

/**
 * @ClassName AmericanDessertFactory
 * @Description TODO
 * @Author jet
 * @Date 2022/4/11 23:21
 * @Version 1.0
 **/
public class AmericanDessertFactory implements  DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
