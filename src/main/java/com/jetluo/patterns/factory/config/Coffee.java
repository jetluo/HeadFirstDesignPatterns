package com.jetluo.patterns.factory.config;

/**
 * @ClassName Coffee
 * @Description TODO
 * @Author jet
 * @Date 2022/4/10 22:36
 * @Version 1.0
 **/
public abstract class Coffee {

    public abstract String getName();

    public void addSugar(){
        System.out.println("加糖");
    }
    public void addMilk(){
        System.out.println("加奶");
    }
}
