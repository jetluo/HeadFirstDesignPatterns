package com.jetluo.patterns.observer.demo2.after;

/**
 * @ClassName Rectangle
 * @Description TODO
 * @Author jet
 * @Date 2022/4/4 23:29
 * @Version 1.0
 **/
public class Rectangle implements Quadrilateral{
   private  double width;
   private  double length;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
