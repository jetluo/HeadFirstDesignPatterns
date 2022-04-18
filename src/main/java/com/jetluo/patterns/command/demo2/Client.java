package com.jetluo.patterns.command.demo2;

/**
 * @ClassName Client
 * @Description TODO
 * @Author jet
 * @Date 2022/4/18 23:20
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);
        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
}
