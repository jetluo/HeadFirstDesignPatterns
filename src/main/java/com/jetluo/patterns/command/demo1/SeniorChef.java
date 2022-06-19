package com.jetluo.patterns.command.demo1;

/**
 * @ClassName SeniorChef
 * @Description 实现者/接收者（Receiver）角色 厨师
 *  完成订单具体内容的人
 * @Author jet
 * @Date 2022/4/18 22:10
 * @Version 1.0
 **/
public class SeniorChef {
    public void makeFood(String name,int num){
        System.out.println(num+"份"+name);
    }
}
