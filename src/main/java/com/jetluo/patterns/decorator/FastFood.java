package com.jetluo.patterns.decorator;

/**
 * @ClassName FastFood
 * @Description 装饰者模式  -> 抽象构建角色 Component
 *  快餐类
 * @Author jet
 * @Date 2022/4/7 13:39
 * @Version 1.0
 **/
public abstract class FastFood {
    // 价格
    public float  price;
    // 描述
    public String desc;

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
   /**
    * @Author jet
    * @Description //价格
    * @Date 2022/4/7
    * @return float 价格
    **/
    public abstract float cast();
}
