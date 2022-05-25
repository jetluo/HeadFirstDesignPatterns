package com.jetluo.patterns.decorator.demo1;

/**
 * @ClassName Coffice
 * @Description Component
 * @Author jet
 * @Date 2022/5/21 10:24
 * @Version 1.0
 **/
public abstract class Coffee {
    /**
     * @Author jet
     * @Description //价格
     * @Date 2022/5/21
     * @Param []
     * @return int
     **/
    public abstract int getPrice();
    /**
     * @Author jet
     * @Description //名字
     * @Date 2022/5/21
     * @Param []
     * @return java.lang.String
     **/
    public abstract String getName();
}
