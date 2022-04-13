package com.jetluo.patterns.factory.abstracts;

/**
 * @ClassName DessertFactory
 * @Description TODO
 * @Author jet
 * @Date 2022/4/11 23:19
 * @Version 1.0
 **/
public interface DessertFactory {
    public Coffee createCoffee();
    public Dessert createDessert();
}
