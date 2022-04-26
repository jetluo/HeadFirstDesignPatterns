package com.jetluo.patterns.state.before;

/**
 * @ClassName Left
 * @Description TODO
 * @Author jet
 * @Date 2022/4/25 22:51
 * @Version 1.0
 **/
public class Left implements  Ileft{

    //声明一个记录当前电梯状态

    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state){
            case OPENING_STATE:
                System.out.println("电梯关门了。。。");
                setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                System.out.println("电梯打开了。。。");
                setState(OPENING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("电梯打开了。。。");
                setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                break;
        }
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
