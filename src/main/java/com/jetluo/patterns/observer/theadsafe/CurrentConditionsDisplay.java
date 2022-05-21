package com.jetluo.patterns.observer.theadsafe;



/**
 * @ClassName CurrentConditionsDisplay
 * @Description 具体的观察者
 *  Observer 的update()方法，这个方法会被Observable主题notifyObservers调用。
 * @Author jet
 * @Date 2022/4/1 23:05
 * @Version 1.0
 **/
public class CurrentConditionsDisplay implements Observer, DisployElement {


    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject subject){

        subject.addObserver(this);

    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
    /**
     * @Author jet
     * @Description //更新观察者数据。
     * @Date 2022/4/2
     * @Param [o, arg]
     * @return void
     **/
    @Override
    public void update(Subject subject, Object arg) {
        if (subject instanceof WeatherData){
            WeatherData weatherData =(WeatherData) subject;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
