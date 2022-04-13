package com.jetluo.patterns.factory.method;

/**
 * @ClassName CoffeeStore
 * @Description TODO
 * @Author jet
 * @Date 2022/4/10 22:40
 * @Version 1.0
 **/
public class CoffeeStore {

    private  CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory){
        this.factory = factory;
    }
    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
