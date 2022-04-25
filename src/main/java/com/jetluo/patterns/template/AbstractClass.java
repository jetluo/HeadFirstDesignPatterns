package com.jetluo.patterns.template;

/**
 * @ClassName AbstractClass
 * @Description 抽象类（定义模版方法和基本方法）
 * @Author jet
 * @Date 2022/4/21 22:56
 * @Version 1.0
 **/
public abstract class AbstractClass {
    /**
     * @Author jet
     * @Description //模版方法定义
     * @Date 2022/4/21
     * @Param []
     * @return void
     **/
    public final void cookProcess(){
        pourOil();
        heatOil();
        pourVegetable();
        pourSause();
        fry();
    }

    public void pourOil(){
        System.out.println("倒油");
    }
    public void heatOil(){
        System.out.println("热油");
    }
    /**
     * @Author jet
     * @Description //倒蔬菜
     * @Date 2022/4/21 
     * @Param []
     * @return void
     **/
    public abstract void pourVegetable();
    /**
     * @Author jet
     * @Description //倒调料
     * @Date 2022/4/21 
     * @Param []
     * @return void
     **/
    public abstract void pourSause();
    /**
     * @Author jet
     * @Description //翻炒
     * @Date 2022/4/21
     * @Param []
     * @return void
     **/
    public void fry(){
        System.out.println("炒啊炒到熟菜为止。。。。。");
    }
}
