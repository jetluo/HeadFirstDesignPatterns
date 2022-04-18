package com.jetluo.patterns.command.demo1;

import java.util.Map;
import java.util.Set;

/**
 * @ClassName OrderCommand
 * @Description 具体命令（Concrete command）角色
 *  通常会持有接收者（SeniorChef），并调用接收者的功能来完成命令要执行的
 * @Author jet
 * @Date 2022/4/18 22:12
 * @Version 1.0
 **/
public class OrderCommand implements Command{
    private  SeniorChef receiver;
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable()+"桌的订单");
        Map<String,Integer> fooderDir = order.getFoodDir();
        Set<String> keys = fooderDir.keySet();
        for (String foodName:keys) {
            // 调用接收者功能。
            receiver.makeFood(foodName, fooderDir.get(foodName));
        }
        System.out.println(order.getDiningTable()+"桌的饭准备完毕");
    }
}
