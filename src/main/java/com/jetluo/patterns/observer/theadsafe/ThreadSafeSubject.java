package com.jetluo.patterns.observer.theadsafe;


import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName ThreadSafeSubject
 * @Description 具体主题（具体被观察者）
 *   该角色的职责：将有关状态存入具体观察者对象，在具体主题的内部
 *   状态发生改变时，给所有注册过的观察者发送通知。
 * @Author jet
 * @Date 2022/4/6 13:59
 * @Version 1.0
 **/
public class ThreadSafeSubject implements Subject{

    private final Object MONITOR = new Object();

    private Set<Observer> observerSet;

    @Override
    public void addObserver(Observer observer) {
        if ( observer == null){
            return;
        }
        synchronized (MONITOR){
            if (observerSet == null) {
                observerSet = new HashSet<Observer>(1);
            }
            if (observerSet.add(observer) && observerSet.size() == 1){
                // some initialization when first observer added
            }
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if ( observer == null){
            return;
        }
        synchronized (MONITOR){
            if (observerSet!=null && observerSet.remove(observer) && observerSet.isEmpty()){
                //some cleanup when last observer removed
            }
        }
    }

    @Override
    public void notifyObservers() {
        notifyObservers(null);
    }

    @Override
    public void notifyObservers(Object object) {
        Set<Observer> observersCopy;
        synchronized (MONITOR){
            if (observerSet == null){
                return;
            }
            observersCopy = new HashSet<>(observerSet);
        }
        for (Observer observer:observersCopy){
            observer.update(this, object);
        }
    }
}
