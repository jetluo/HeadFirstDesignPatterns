package com.jetluo.patterns.adapter.object_adapter;

/**
 * @Author jet
 * @Description //适配者（Adaptee）类:他是被访问和适配的现存组件库中的组件接口
 * @Date 2022/6/18
 * @Param
 * @return
 **/
public interface TFCard {
    String readTF();
    void writeTF(String msg);
}
