package com.jetluo.patterns.observer.demo3.after;

/**
 * @ClassName KingstonMemory
 * @Description TODO
 * @Author jet
 * @Date 2022/4/4 23:50
 * @Version 1.0
 **/
public class KingstonMemory implements Memory {
    @Override
    public void save() {
        System.out.println("使用金士顿内存条");
    }
}
