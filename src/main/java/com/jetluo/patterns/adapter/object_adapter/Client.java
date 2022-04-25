package com.jetluo.patterns.adapter.object_adapter;

/**
 * @ClassName Client
 * @Description 对象适配器模式
 * @Author jet
 * @Date 2022/4/20 22:58
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);
        System.out.println("================");
        TFCard tfCard = new TFCardImpl();
        String msg2 =  computer.readSD(new SDAdapterTF(tfCard));
        System.out.println(msg2);
    }
}
