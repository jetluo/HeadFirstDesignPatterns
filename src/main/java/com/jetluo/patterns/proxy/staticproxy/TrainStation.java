package com.jetluo.patterns.proxy.staticproxy;

/**
 * @ClassName TrainStation
 * @Description TODO
 * @Author jet
 * @Date 2022/4/26 22:36
 * @Version 1.0
 **/
public class TrainStation implements SellTickets{

    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
