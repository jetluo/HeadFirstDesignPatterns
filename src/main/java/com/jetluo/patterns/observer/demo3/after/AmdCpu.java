package com.jetluo.patterns.observer.demo3.after;

/**
 * @ClassName IntelCpu
 * @Description TODO
 * @Author jet
 * @Date 2022/4/4 23:49
 * @Version 1.0
 **/
public class AmdCpu implements Cpu{
    @Override
    public void run(){
        System.out.println("使用Amd cpu");
    }
}
