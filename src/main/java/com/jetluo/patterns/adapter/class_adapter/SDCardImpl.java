package com.jetluo.patterns.adapter.class_adapter;

/**
 * @ClassName SDCardImpl
 * @Description TODO
 * @Author jet
 * @Date 2022/4/20 22:55
 * @Version 1.0
 **/
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        String msg = "SDCard read msg: hello word SDCard";

        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg:"+msg);
    }
}
