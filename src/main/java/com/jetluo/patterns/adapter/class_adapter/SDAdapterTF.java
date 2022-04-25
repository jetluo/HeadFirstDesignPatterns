package com.jetluo.patterns.adapter.class_adapter;

/**
 * @ClassName SDAdapterTF
 * @Description 适配器类
 * @Author jet
 * @Date 2022/4/20 23:02
 * @Version 1.0
 **/
public class SDAdapterTF extends TFCardImpl  implements  SDCard {

    @Override
    public String readSD() {
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        writeTF(msg);
    }
}
