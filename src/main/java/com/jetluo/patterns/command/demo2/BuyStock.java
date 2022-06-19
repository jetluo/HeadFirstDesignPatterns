package com.jetluo.patterns.command.demo2;

/**
 * @ClassName BuyStock
 * @Description 具体命令，命令实现类
 * @Author jet
 * @Date 2022/4/18 23:15
 * @Version 1.0
 **/
public class BuyStock implements Order{

    private  Stock abcStock;

    public BuyStock(Stock stock){
        abcStock = stock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
