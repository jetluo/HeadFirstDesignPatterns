package com.jetluo.patterns.template;

/**
 * @ClassName Client
 * @Description TODO
 * @Author jet
 * @Date 2022/4/21 23:07
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        ConcreteClass_BaoCai baoCai = new ConcreteClass_BaoCai();
        baoCai.cookProcess();

        ConcreteClass_CaiXin Caixin = new ConcreteClass_CaiXin();
        Caixin.cookProcess();
    }
}
