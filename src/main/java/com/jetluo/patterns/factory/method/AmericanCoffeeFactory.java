package com.jetluo.patterns.factory.method;

/**
 * @ClassName AmericanCoffeeFactory
 * @Description TODO
 * @Author jet
 * @Date 2022/4/10 22:43
 * @Version 1.0
 **/
public class AmericanCoffeeFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
