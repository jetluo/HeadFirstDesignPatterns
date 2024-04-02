package com.jetluo.patterns.template;

import java.util.Arrays;

/**
 * @ClassName Client
 * @Description TODO
 * @Author jet
 * @Date 2022/4/21 23:07
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        ConcreteClass_BaoCai baoCai = new ConcreteClass_BaoCai();
        baoCai.cookProcess();
        System.out.println("++++++++++++++");
        ConcreteClass_CaiXin Caixin = new ConcreteClass_CaiXin();
        Caixin.cookProcess();

        SgCcs sgCcs= new SgCcs();
        System.out.println(sgCcs.post());


        Duck[] ducks = {
                new Duck("A", 8),
                new Duck("B", 1),
                new Duck("C", 10),
                new Duck("D", 5)
        };
        System.out.println("排序前：");
        display(ducks);
        Arrays.sort(ducks);
        System.out.println("排序后：");
        display(ducks);
    }
    public static void display(Duck[] ducks){
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}
