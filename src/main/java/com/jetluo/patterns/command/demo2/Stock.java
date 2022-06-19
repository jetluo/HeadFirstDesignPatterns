package com.jetluo.patterns.command.demo2;

/**
 * @ClassName Stock
 * @Description 实现者/接收者 ，真正执行命令的人
 * @Author jet
 * @Date 2022/4/18 23:14
 * @Version 1.0
 **/
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity + " ]bought ");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity + " ]sold ");
    }
}
