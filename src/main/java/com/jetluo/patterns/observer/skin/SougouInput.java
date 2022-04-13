package com.jetluo.patterns.observer.skin;

/**
 * @ClassName SogoSkin
 * @Description 聚合皮肤
 * @Author jet
 * @Date 2022/4/4 14:39
 * @Version 1.0
 **/
public class SougouInput {
    private  AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }
    public void display(){
        this.skin.display();
    }
}
