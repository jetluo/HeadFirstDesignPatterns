package com.jetluo.patterns.adapter.object_adapter;

/**
 * @ClassName TFCardImpl
 * @Description TODO
 * @Author jet
 * @Date 2022/4/20 22:51
 * @Version 1.0
 **/
public class TFCardImpl implements TFCard {

    @Override
    public String readTF() {
        String msg = "TFCard read msg: hello word TFCard";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg: "+msg);
    }
}
