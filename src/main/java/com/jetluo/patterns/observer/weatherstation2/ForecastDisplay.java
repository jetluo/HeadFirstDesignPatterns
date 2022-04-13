package com.jetluo.patterns.observer.weatherstation2;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName ForecastDisplay
 * @Description TODO
 * @Author jet
 * @Date 2022/4/2 11:19
 * @Version 1.0
 **/
public class ForecastDisplay implements Observer,DisployElement {

    private  float currentPressure = 29.92f;

    private  float lastPressure;

    public ForecastDisplay(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData =(WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
