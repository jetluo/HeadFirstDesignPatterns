package com.jetluo.patterns.observer.weatherstation1;

/**
 * @ClassName StatisticsDisplay
 * @Description TODO
 * @Author jet
 * @Date 2022/3/31 22:28
 * @Version 1.0
 **/
public class StatisticsDisplay implements Observer, DisployElement {

    private float maxTemp = 0.0f;

    private float minTemp = 200;

    private float tempSum = 0.0f;

    private int numReadings;

    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
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
