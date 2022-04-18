package com.jetluo.patterns.command.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Waiter
 * @Description 调用者/请求者（Invoker）角色
 * 接收命令并发出命令
 * @Author jet
 * @Date 2022/4/18 22:19
 * @Version 1.0
 **/
public class Waitor {
    private List<Command> commands = new ArrayList<Command>();

    public void setCommand(Command command){
        commands.add(command);
    }

    public void orderup(){
        System.out.println("美女服务员：新订单来来。。。");
        for (Command commnad:commands) {
            commnad.execute();
        }
    }
}
