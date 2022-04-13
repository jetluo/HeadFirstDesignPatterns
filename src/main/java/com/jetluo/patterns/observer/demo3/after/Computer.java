package com.jetluo.patterns.observer.demo3.after;

/**
 * @ClassName Computer
 * @Description TODO
 * @Author jet
 * @Date 2022/4/5 00:05
 * @Version 1.0
 **/
public class Computer {

    private Cpu cpu;
    private Memory memory;

    private  HardDisk hardDisk;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void run(){
        System.out.println("运行计算机");
        String data= hardDisk.get();
        System.out.println("硬盘数据"+ data);

        cpu.run();
        memory.save();

    }
}
