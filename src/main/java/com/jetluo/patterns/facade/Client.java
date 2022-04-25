package com.jetluo.patterns.facade;

/**
 * @ClassName Client
 * @Description TODO
 * @Author jet
 * @Date 2022/4/21 22:24
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        smartAppliancesFacade.say("开哈");
        smartAppliancesFacade.say("关了");
    }
}
