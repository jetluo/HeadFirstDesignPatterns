package com.jetluo.patterns.observer.weatherstation1;

/**
 * @ClassName CurrnetConditionsDisploy
 * @Description TODO
 * @Author jet
 * @Date 2022/3/31 14:14
 * @Version 1.0
 **/
public class CurrentConditionsDisplay implements Observer,DisployElement{

    private  float temperature;
    private  float humidity;
    private  Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature +"F degrees and " + humidity +"% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
