package com.jetluo.patterns.observer.demo3.before;

/**
 * @ClassName XiJieHardDisk
 * @Description TODO
 * @Author jet
 * @Date 2022/4/4 23:47
 * @Version 1.0
 **/
public class XiJieHardDisk {
    public void save(String data){
        System.out.println("希捷数据："+data);
    }
    public String get(){
        System.out.println("读取数据");
        return "希捷数据";
    }
}
