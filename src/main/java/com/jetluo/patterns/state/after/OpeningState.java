package com.jetluo.patterns.state.after;

/**
 * @ClassName OpeningState
 * @Description TODO
 * @Author jet
 * @Date 2022/4/25 23:12
 * @Version 1.0
 **/
public class OpeningState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯开启...");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.close();
    }

    @Override
    public void run() {
        // 不做
    }

    @Override
    public void stop() {
        // 不做
    }
}
