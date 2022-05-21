package com.jetluo.patterns.observer.theadsafe;


import java.util.Set;

/**
 * @Author jet
 * @Description //抽象主题接口
 * @Date 2022/3/31
 * @Param
 * @return
 **/
public interface Subject {


    /**
     * @Author jet
     * @Description //订阅
     * @Date 2022/4/6
     * @Param [o]
     * @return void
     **/
    public void addObserver(Observer observer);

    /**
     * @Author jet
     * @Description //删除订阅
     * @Date 2022/3/31
     * @Param [o]
     * @return void
     **/
    public void removeObserver(Observer observer);
    
    /**
     * @Author jet
     * @Description //发布通知
     * @Date 2022/4/6 
     * @Param []
     * @return void
     **/
    public void notifyObservers();

    /**
     * @Author jet
     * @Description //发布通知
     * @Date 2022/4/6
     * @Param []
     * @return void
     **/
    public void notifyObservers(Object o);

}
