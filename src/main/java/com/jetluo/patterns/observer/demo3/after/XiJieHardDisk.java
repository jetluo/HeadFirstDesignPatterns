package com.jetluo.patterns.observer.demo3.after;

/**
 * @ClassName XiJieHardDisk
 * @Description TODO
 * @Author jet
 * @Date 2022/4/4 23:47
 * @Version 1.0
 **/
public class XiJieHardDisk implements HardDisk{
    @Override
    public void save(String data){
        System.out.println("希捷数据："+data);
    }
    @Override
    public String get(){
        System.out.println("读取数据");
        return "希捷数据";
    }
}
