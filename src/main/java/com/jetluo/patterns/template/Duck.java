package com.jetluo.patterns.template;

/**
 * @ClassName Duck
 * @Description TODO
 * @Author jet
 * @Date 2022/8/6 15:08
 * @Version 1.0
 **/
public class Duck implements Comparable<Duck>{
    private String name;
    private  int weight;

    public Duck(String name,int weight){
        this.name = name;
        this.weight = weight;
    }
    @Override
    public String toString(){
        return name+" weights :" + weight;
    }


    @Override
    public int compareTo(Duck duck) {
        if (this.weight < duck.weight) {
            return -1;
        }else  if (this.weight == duck.weight){
            return  0;
        }else {
            return  1;
        }
    }
}
