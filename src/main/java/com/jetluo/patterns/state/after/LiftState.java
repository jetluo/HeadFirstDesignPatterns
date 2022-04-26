package com.jetluo.patterns.state.after;

/**
 * @ClassName LiftState
 * @Description TODO
 * @Author jet
 * @Date 2022/4/25 23:10
 * @Version 1.0
 **/
public abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public  abstract  void open();

    public  abstract  void close();

    public  abstract  void run();

    public  abstract  void stop();

}
