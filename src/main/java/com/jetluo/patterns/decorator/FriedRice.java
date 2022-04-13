package com.jetluo.patterns.decorator;

/**
 * @ClassName FriedRice
 * @Description  具体构建角色 Concrete Component 实现抽象构建
 * 炒饭
 * @Author jet
 * @Date 2022/4/7 22:45
 * @Version 1.0
 **/
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cast() {
        return getPrice();
    }
}
