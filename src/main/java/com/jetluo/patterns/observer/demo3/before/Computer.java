package com.jetluo.patterns.observer.demo3.before;

/**
 * @ClassName Computer
 * @Description TODO
 * @Author jet
 * @Date 2022/4/4 23:50
 * @Version 1.0
 **/
public class Computer {
    private XiJieHardDisk hardDisk;
    private IntelCpu cpu;
    private  KingstonMemory memory;

    public XiJieHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XiJieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }

    public void run(){
        System.out.println("运行计算机");
        String data= hardDisk.get();
        System.out.println("硬盘数据"+ data);

        cpu.run();
        memory.save();

    }
}
