package com.jetluo.patterns.observer.weatherstation2;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName StatisticsDisplay
 * @Description TODO
 * @Author jet
 * @Date 2022/4/2 11:25
 * @Version 1.0
 **/
public class StatisticsDisplay implements Observer,DisployElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;

    public StatisticsDisplay(Observable observable){
        observable.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            float temp = weatherData.getTemperature();
            tempSum += temp;
            numReadings++;

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }

            display();
        }
    }
}
