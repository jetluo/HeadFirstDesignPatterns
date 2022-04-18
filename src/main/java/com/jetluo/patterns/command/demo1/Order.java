package com.jetluo.patterns.command.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Order
 * @Description 订单类
 * @Author jet
 * @Date 2022/4/18 22:06
 * @Version 1.0
 **/
public class Order {

    //几号桌子
    private int diningTable;

    //菜名和份数
    private Map<String,Integer> foodDir = new HashMap<String,Integer>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFoodDir(String name,int num) {
        this.foodDir.put(name, num);
    }
}
