package com.jetluo.patterns.state.after;

/**
 * @ClassName Context
 * @Description 环境角色类
 * @Author jet
 * @Date 2022/4/25 23:09
 * @Version 1.0
 **/
public class Context {
    public final  static  OpeningState OPENING_STATE=new OpeningState();
    public final  static ClosingState CLOSING_STATE = new ClosingState();
    public final  static RunningState RUNNING_STATE = new RunningState();
    public final  static StoppingState STOPPING_STATE = new StoppingState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }
    public void close(){
        this.liftState.close();
    }
    public void stop(){
        this.liftState.stop();
    }
    public void run(){
        this.liftState.run();
    }

}
