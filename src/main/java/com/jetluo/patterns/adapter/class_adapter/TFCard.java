package com.jetluo.patterns.adapter.class_adapter;

/**
 * @ClassName TFCardImpl
 * @Description //适配者（Adaptee）类:他是被访问和适配的现存组件库中的组件接口
 * @Author jet
 * @Date 2022/4/20 22:51
 * @Version 1.0
 **/
public class TFCard{


    public String readTF() {
        String msg = "TFCard read msg: hello word TFCard";
        return msg;
    }


    public void writeTF(String msg) {
        System.out.println("TFCard write msg: "+msg);
    }
}
