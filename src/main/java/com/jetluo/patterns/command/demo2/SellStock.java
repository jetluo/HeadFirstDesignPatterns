package com.jetluo.patterns.command.demo2;

/**
 * @ClassName BuyStock
 * @Description TODO
 * @Author jet
 * @Date 2022/4/18 23:15
 * @Version 1.0
 **/
public class SellStock implements Order{

    private  Stock abcStock;

    public SellStock(Stock stock){
        abcStock = stock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
