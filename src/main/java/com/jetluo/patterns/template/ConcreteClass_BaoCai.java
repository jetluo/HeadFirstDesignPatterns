package com.jetluo.patterns.template;

/**
 * @ClassName ConcreteClass_BaoCai
 * @Description TODO
 * @Author jet
 * @Date 2022/4/21 23:05
 * @Version 1.0
 **/
public class ConcreteClass_BaoCai extends  AbstractClass{

    private  boolean open = false;


    @Override
    public void pourVegetable() {
        open = true;
        System.out.println("下包菜");
    }

    @Override
    public void pourSause() {
        System.out.println("下辣椒");
    }

    @Override
   public boolean isHook() {
        return open;
    }
}
