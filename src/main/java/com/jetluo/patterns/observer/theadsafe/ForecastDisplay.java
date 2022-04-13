package com.jetluo.patterns.observer.theadsafe;


/**
 * @ClassName ForecastDisploy
 * @Description TODO
 * @Author jet
 * @Date 2022/3/31 22:36
 * @Version 1.0
 **/
public class ForecastDisplay implements Observer, DisployElement {

    private float currentPressure = 29.92f;

    private float lastPressure;

    public ForecastDisplay(ThreadSafeSubject subject) {
        subject.addObserver(this);
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
    public void update(Subject subject, Object arg) {
        if (subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) subject;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
