package com.jetluo.patterns.observer.event;


/**
 * @Author jet
 * @Description //监听器
 * 原来主题的订阅对象Observer
 * @Date 2022/5/20
 * @Param
 * @return
 **/
public interface Listener {

    void onClick(Event event);
}
