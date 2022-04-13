package com.jetluo.patterns.observer.demo2.before;

/**
 * @ClassName Square
 * @Description TODO
 * @Author jet
 * @Date 2022/4/4 14:55
 * @Version 1.0
 **/
public class Square extends Rectangle{
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
