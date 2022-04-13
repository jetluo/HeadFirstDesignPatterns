package com.jetluo.patterns.observer.demo2.after;

/**
 * @ClassName Client
 * @Description TODO
 * @Author jet
 * @Date 2022/4/4 23:31
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setWidth(10);
        resize(r);
        printRectangle(r);


    }

    public static  void resize( Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }
    public static  void printRectangle(Quadrilateral quadrilateral){
        System.out.println("rectangle: width" + quadrilateral.getWidth() + "length:" + quadrilateral.getLength());

    }
}
