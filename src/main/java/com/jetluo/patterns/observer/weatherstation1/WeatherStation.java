package com.jetluo.patterns.observer.weatherstation1;

/**
 * @ClassName WeatherStation
 * @Description TODO
 * @Author jet
 * @Date 2022/3/31 14:23
 * @Version 1.0
 **/
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay=new StatisticsDisplay(weatherData);
         ForecastDisploy forecastDisploy = new ForecastDisploy(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
