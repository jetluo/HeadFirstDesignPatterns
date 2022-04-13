package com.jetluo.patterns.observer.demo3.after;

/**
 * @ClassName Client
 * @Description 符合开闭原则，依赖倒转
 * @Author jet
 * @Date 2022/4/4 23:54
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
       Computer c = new Computer();
        c.setCpu( new AmdCpu());
        c.setHardDisk(new XiJieHardDisk());
        c.setMemory(new KingstonMemory());
        c.run();
    }
}
