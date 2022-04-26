package com.jetluo.patterns.state.after;

/**
 * @ClassName Client
 * @Description TODO
 * @Author jet
 * @Date 2022/4/26 22:11
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());

        context.open();
        context.run();
        context.close();
        context.stop();
    }
}
