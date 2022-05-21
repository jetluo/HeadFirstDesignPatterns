package com.jetluo.patterns.observer.event;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName ListenerSupport
 * @Description Subject的实现类
 * @Author jet
 * @Date 2022/5/20 09:45
 * @Version 1.0
 **/
public class ListenerSupport {
    private Set<Listener> listeners = new HashSet<>();

    public void addListener(Listener listener){
        listeners.add(listener);
    }
    public void triggerEvent(Event event){
        for (Listener listener:listeners) {
            listener.onClick(event);
        }
    }
}
