package com.jetluo.patterns.observer.weatherstation1;

/**
 * @ClassName ForecastDisploy
 * @Description TODO
 * @Author jet
 * @Date 2022/3/31 22:36
 * @Version 1.0
 **/
public class ForecastDisploy implements Observer,DisployElement{
    private  float currentPressure = 29.92f;

    private float lastPressure;

    private WeatherData weatherData;

    public ForecastDisploy(WeatherData weatherData){
        weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast: ");
        if (currentPressure > lastPressure){
            System.out.println("Improving weather on the way!");
        }else if (currentPressure == lastPressure){
            System.out.println(" More of the same");
        }else if (currentPressure < lastPressure){
            System.out.println("watch out for cooler,rainy weather");
        }
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
}
