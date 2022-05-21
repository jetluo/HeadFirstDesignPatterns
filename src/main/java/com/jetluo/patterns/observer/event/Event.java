package com.jetluo.patterns.observer.event;

/**
 * @ClassName Event
 * @Description TODO
 * @Author jet
 * @Date 2022/5/20 09:35
 * @Version 1.0
 **/
public class Event {
    private String data;
    private String type;

    public Event(String data, String type) {
        this.data = data;
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
