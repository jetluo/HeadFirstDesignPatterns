package com.jetluo.patterns.command.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Broker
 * @Description 命令调用类
 * @Author jet
 * @Date 2022/4/18 23:18
 * @Version 1.0
 **/
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }
    public void placeOrders(){
        for (Order order:orderList){
            order.execute();
        }
        orderList.clear();
    }
}
