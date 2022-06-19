package com.jetluo.patterns.decorator.demo1;

/**
 * @ClassName MilkDecorator
 * @Description TODO
 * @Author jet
 * @Date 2022/5/21 10:28
 * @Version 1.0
 **/
public class MilkDecorator extends Decorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return  coffee.getPrice() + 10;
    }

    @Override
    public String getName() {
        return coffee.getName()+ "+Milk";
    }
}
