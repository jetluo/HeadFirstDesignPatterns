package com.jetluo.patterns.decorator.demo1;

/**
 * @ClassName SimpleCoffee
 * @Description TODO
 * @Author jet
 * @Date 2022/5/21 10:34
 * @Version 1.0
 **/
public class SimpleCoffee extends  Coffee{

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public String getName() {
        return "咖啡";
    }
}
