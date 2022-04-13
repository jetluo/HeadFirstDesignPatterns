package com.jetluo.patterns.observer.skin;

/**
 * @ClassName Client
 * @Description 开闭原则 ，本例子使用了聚合关系和实现关系
 * @Author jet
 * @Date 2022/4/4 14:41
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        SougouInput input = new SougouInput();
       // DefaultSkin skin = new DefaultSkin();
        HemaSkin skin1 = new HemaSkin();
        input.setSkin(skin1);
        input.display();
    }
}
