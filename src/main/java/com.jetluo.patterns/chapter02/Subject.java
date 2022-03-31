package com.jetluo.patterns.chapter02;


/**
 * @Author jet
 * @Description //TODO
 * @Date 2022/3/31
 * @Param
 * @return
 **/
public interface Subject {
    /**
     * @Author jet
     * @Description 订阅
     * @Date 2022/3/31
     * @Param [o]
     * @return void
     **/
    public void registerObserver(Observer o);
    /**
     * @Author jet
     * @Description //删除订阅
     * @Date 2022/3/31
     * @Param [o]
     * @return void
     **/
    public void removeObserver(Observer o);
    /**
     * @Author jet
     * @Description //发布通知
     * @Date 2022/3/31
     * @Param []
     * @return void
     **/
    public void notifyObserver();
}
