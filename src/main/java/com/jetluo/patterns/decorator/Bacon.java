package com.jetluo.patterns.decorator;

/**
 * @ClassName Egg
 * @Description 培根类，具体的装饰者角色
 * @Author jet
 * @Date 2022/4/7 22:56
 * @Version 1.0
 **/
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(2, "培根", fastFood);
    }

    /**
     * @return float
     * @Author jet
     * @Description //计算价格 重写，原来功能基础上添加新逻辑并且不影响原来的逻辑
     * @Date 2022/4/7
     * @Param []
     **/
    @Override
    public float cast() {
        return getPrice() + getFastFood().cast();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
