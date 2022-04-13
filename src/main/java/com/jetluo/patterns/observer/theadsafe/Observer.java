package com.jetluo.patterns.observer.theadsafe;

/**
 * @Author jet
 * @Description 抽象观察者模式
 * @Date 2022/4/6 
 * @Param 
 * @return 
 **/
public interface Observer {
    /**
     * @Author jet
     * @Description 更新
     * @Date 2022/4/6 
     * @Param [o, arg]
     * @return void
     **/
    void update(Subject subject, Object arg);
}
