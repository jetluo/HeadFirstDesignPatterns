package com.jetluo.patterns.chapter02;

/**
 * @Author jet
 * @Description 观察者模式实现气象站
 * @Date 2022/3/31
 * @Param
 * @return
 **/
public interface Observer {
    /**
     * @Author jet
     * @Description 更新通知
     * @Date 2022/3/31
     * @Param temp 温度
     * @Param humidity 温度
     * @Param pressure 温度
     * @return void
     **/
    public void update(float temp, float humidity, float pressure);
}
