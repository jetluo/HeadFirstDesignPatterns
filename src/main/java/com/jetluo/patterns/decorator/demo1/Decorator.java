package com.jetluo.patterns.decorator.demo1;

/**
 * @ClassName Decorator
 * @Description TODO
 * @Author jet
 * @Date 2022/5/21 10:26
 * @Version 1.0
 **/
public abstract class Decorator extends Coffee {
    protected  Coffee coffee;

    public Decorator(Coffee coffee){
        this.coffee = coffee;
    }
}
