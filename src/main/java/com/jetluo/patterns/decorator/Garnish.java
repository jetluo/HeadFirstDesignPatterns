package com.jetluo.patterns.decorator;

/**
 * @ClassName Garnish
 * @Description 装饰者类 抽象装饰者角色 Decorator
 * @Author jet
 * @Date 2022/4/7 22:51
 * @Version 1.0
 **/
public abstract class Garnish extends FastFood{
    // 声明快餐类变量
    private  FastFood fastFood;

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
