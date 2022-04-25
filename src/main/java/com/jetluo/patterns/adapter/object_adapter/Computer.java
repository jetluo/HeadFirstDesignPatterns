package com.jetluo.patterns.adapter.object_adapter;

/**
 * @ClassName Computer
 * @Description TODO
 * @Author jet
 * @Date 2022/4/20 22:56
 * @Version 1.0
 **/
public class Computer {
    public String readSD(SDCard sdCard){
        if (sdCard == null) {
            throw new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }
    public void writeSD(SDCard sdCard){
        if (sdCard == null) {
            throw new NullPointerException("sd card is not null");
        }
         sdCard.writeSD("sd card data writing");
    }
}
