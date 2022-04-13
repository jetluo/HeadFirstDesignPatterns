package com.jetluo.patterns.decorator;

/**
 * @ClassName Egg
 * @Description 鸡蛋类，具体的装饰者角色
 * @Author jet
 * @Date 2022/4/7 22:56
 * @Version 1.0
 **/
public class Egg extends Garnish {

    public Egg( FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }
    /**
     * @Author jet
     * @Description //计算价格
     * @Date 2022/4/7
     * @Param []
     * @return float
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
