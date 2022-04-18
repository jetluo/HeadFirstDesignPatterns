package com.jetluo.patterns.command.demo1;

/**
 * @ClassName Client
 * @Description 命令模式
 * @Author jet
 * @Date 2022/4/18 22:22
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFoodDir("鸡蛋面", 1);
        order1.setFoodDir("羊肉串", 2);

        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFoodDir("面", 1);
        order2.setFoodDir("啤酒", 1);

        SeniorChef receiver = new SeniorChef();

        OrderCommand com1 = new OrderCommand(receiver, order1);
        OrderCommand com2 = new OrderCommand(receiver, order2);

        Waitor invoke = new Waitor();
        invoke.setCommand(com1);
        invoke.setCommand(com2);

        invoke.orderup();
    }
}
