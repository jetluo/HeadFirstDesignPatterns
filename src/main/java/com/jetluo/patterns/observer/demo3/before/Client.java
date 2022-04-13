package com.jetluo.patterns.observer.demo3.before;

/**
 * @ClassName Client
 * @Description TODO
 * @Author jet
 * @Date 2022/4/4 23:54
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.setCpu( new IntelCpu());
        c.setHardDisk(new XiJieHardDisk());
        c.setMemory(new KingstonMemory());
        c.run();
    }
}
