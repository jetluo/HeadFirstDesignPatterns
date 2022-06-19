package com.jetluo.patterns.adapter.object_adapter;

/**
 * @ClassName SDCard
 * @Description 目标接口（Target）类，当前系统业务所期待的接口，可以是抽象类或接口。
 * @Author jet
 * @Date 2022/4/20 22:54
 * @Version 1.0
 **/
public interface SDCard {
    String readSD();
    void writeSD(String msg);
}
