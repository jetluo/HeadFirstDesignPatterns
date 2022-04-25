package com.jetluo.patterns.facade;

/**
 * @ClassName Light
 * @Description 外观类
 * @Author jet
 * @Date 2022/4/21 22:15
 * @Version 1.0
 **/
public class SmartAppliancesFacade {
   private  Light light;
   private  TV tv;
   private AirCondition airCondition;

   public  SmartAppliancesFacade(){
       light = new Light();
       tv = new TV();
       airCondition = new AirCondition();
   }
   public void say(String message){
       if ( message.contains("开")){
            on();
       }else if(message.contains("关")){
            off();
       }else {
           System.out.println("听不懂");
       }
   }
   private  void on(){
       light.on();
       tv.on();
       airCondition.on();
   }
    private  void off(){
        light.off();
        tv.off();
        airCondition.off();
    }

}
