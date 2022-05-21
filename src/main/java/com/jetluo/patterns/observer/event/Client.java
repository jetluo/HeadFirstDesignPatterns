package com.jetluo.patterns.observer.event;

/**
 * @ClassName Client
 * @Description TODO
 * @Author jet
 * @Date 2022/5/20 09:50
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Listener listener = new ButtonClickListener();
        ListenerSupport listenerSupport = new ListenerSupport();
        listenerSupport.addListener(listener);
        listenerSupport.triggerEvent(new Event("laila ", "button"));
    }
}
