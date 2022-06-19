package com.jetluo.patterns.adapter.object_adapter;

/**
 * @ClassName SDAdapterTF
 * @Description 适配器（Adapter）类,他是一个转换器类，通过继承或引用
 *  适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问
 *  适配者
 * @Author jet
 * @Date 2022/4/20 23:02
 * @Version 1.0
 **/
public class SDAdapterTF  implements SDCard {
    private TFCard tfCard;
    public  SDAdapterTF(TFCard tfCard){
        this.tfCard =tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        tfCard.writeTF(msg);
    }
}
