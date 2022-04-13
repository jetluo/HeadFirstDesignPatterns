package com.jetluo.patterns.observer.weatherstation2;

import java.util.Observable;

/**
 * @ClassName WeatherData
 * @Description 1.新建主题 或者叫可观测者
 *   Observable 作用：追踪所有的观察者，并通知他们。
 * @Author jet
 * @Date 2022/4/1 22:51
 * @Version 1.0
 **/
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;



    public WeatherData(){

    }
    public void measurementsChanged(){
        // 1。先调用setChanged()方法,标记状态已经改变的事实。
        setChanged();
        // 2。调用notifyObservers()方法。通知观察者
        //    或者调用  notifyObservers(Object obj); 推数据给观察者。
        notifyObservers();

    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
