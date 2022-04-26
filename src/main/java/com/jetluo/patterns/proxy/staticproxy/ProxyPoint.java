package com.jetluo.patterns.proxy.staticproxy;

/**
 * @ClassName ProxyPoint
 * @Description TODO
 * @Author jet
 * @Date 2022/4/26 22:37
 * @Version 1.0
 **/
public class ProxyPoint implements  SellTickets{

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点手续费");
        trainStation.sell();
    }
}
