package com.jetluo.patterns.decorator.demo1;

/**
 * @ClassName Client
 * @Description TODO
 * @Author jet
 * @Date 2022/5/21 10:33
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new SugarDecorator(coffee);
        coffee = new MilkDecorator(coffee);
        coffee = new MilkFoamDecorator(coffee);
        System.out.print("姓名" + coffee.getName()+" ");
        System.out.println("价格" + coffee.getPrice());
    }
}
