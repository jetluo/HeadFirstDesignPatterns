package com.jetluo.patterns.decorator;

/**
 * @ClassName FriedRice
 * @Description 具体构建角色 Concrete Component 实现抽象构建
 * 炒面
 * @Author jet
 * @Date 2022/4/7 22:45
 * @Version 1.0
 **/
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(12, "炒面");
    }

    @Override
    public float cast() {
        return getPrice();
    }
}
