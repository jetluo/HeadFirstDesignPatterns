package com.jetluo.patterns.adapter.object_adapter;

/**
 * @ClassName SDAdapterTF
 * @Description 适配器类
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
