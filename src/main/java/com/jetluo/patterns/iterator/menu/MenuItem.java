package com.jetluo.patterns.iterator.menu;

/**
 * @ClassName MenuItem
 * @Description TODO
 * @Author jet
 * @Date 2022/8/7 14:33
 * @Version 1.0
 **/
public class MenuItem extends MenuComponent{
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name,String description,boolean vegetarian,double price){
        this.name = name;
        this.description = description;
        this.vegetarian =vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }


    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }


    @Override
    public double getPrice() {
        return price;
    }

    public void print(){
        System.out.print(" "+getName());
        if (isVegetarian()){
            System.out.print("(V)");
        }
        System.out.println("," + getPrice());
        System.out.println("   -------" + getDescription());
    }
}
