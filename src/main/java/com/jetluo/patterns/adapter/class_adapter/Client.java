package com.jetluo.patterns.adapter.class_adapter;

/**
 * @ClassName Client
 * @Description TODO
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
        String msgTF = computer.readSD(new SDAdapterTF());
        computer.readSD(new SDAdapterTF());
        computer.writeSD(new SDAdapterTF());
        System.out.println(msgTF);
    }
}
