package com.jetluo.patterns.facade;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName Client
 * @Description TODO
 * @Author jet
 * @Date 2022/4/21 22:24
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Client.class);
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        smartAppliancesFacade.say("开哈");
        smartAppliancesFacade.say("关了");
        logger.info("aaaaa");
    }
}
