package com.jetluo.patterns.observer.theadsafe;


/**
 * @ClassName WeatherStation
 * @Description TODO
 * @Author jet
 * @Date 2022/4/6 15:27
 * @Version 1.0
 **/
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        // 注册观察者
        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
        // StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        // 通知观察者
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }
}
