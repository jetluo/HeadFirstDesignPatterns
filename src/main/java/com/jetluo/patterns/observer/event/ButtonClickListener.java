package com.jetluo.patterns.observer.event;

/**
 * @ClassName ButtonClickListener
 * @Description TODO
 * @Author jet
 * @Date 2022/5/20 09:43
 * @Version 1.0
 **/
public class ButtonClickListener implements Listener{

    @Override
    public void onClick(Event event) {
        System.out.println("触发事件，type:" + event.getType()+",data:" + event.getData());
    }

}
