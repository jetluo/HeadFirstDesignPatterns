package com.jetluo.patterns.state.before;

/**
 * @Author jet
 * @Description //电梯接口
 * @Date 2022/4/25
 * @Param
 * @return
 **/
public interface Ileft {
    int OPENING_STATE =  1;
    int CLOSING_STATE =  2;
    int RUNNING_STATE =  3;
    int STOPPING_STATE =  4;
    //设置电梯状态的功能
    void setState(int state);

    void open();
    void close();
    void run();
    void stop();
}
