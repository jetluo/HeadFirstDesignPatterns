package com.jetluo.patterns.observer.demo2.before;

/**
 * @ClassName Client
 * @Description 错误设计
 * @Author jet
 * @Date 2022/4/4 14:58
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setWidth(10);
        resize(r);
        printRectangle(r);

        Square s = new Square();
        s.setWidth(10);
        resize(s);
        printRectangle(s);
    }

    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printRectangle(Rectangle rectangle) {
        System.out.println("rectangle: width" + rectangle.getWidth() + "length:" + rectangle.getLength());
    }

}
