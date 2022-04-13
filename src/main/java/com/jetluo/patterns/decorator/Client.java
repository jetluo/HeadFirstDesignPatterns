package com.jetluo.patterns.decorator;

/**
 * @ClassName Client
 * @Description TODO
 * @Author jet
 * @Date 2022/4/7 23:02
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() +"  "+ food.cast() +"元");
        food = new Egg(food);
        System.out.println(food.getDesc() +"  "+ food.cast() +"元");
        food = new Egg(food);
        System.out.println(food.getDesc() +"  "+ food.cast() +"元");
        food = new Bacon(food);
        System.out.println(food.getDesc() +"  "+ food.cast() +"元");
    }
}
