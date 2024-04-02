package com.jetluo.patterns.iterator.menu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName Menu
 * @Description TODO
 * @Author jet
 * @Date 2022/8/7 14:39
 * @Version 1.0
 **/
public class Menu extends MenuComponent{
   private   ArrayList<MenuComponent> menuComponents = new ArrayList();
    private  String name;
    private  String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public ArrayList getMenuComponents() {
        return menuComponents;
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
    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }
    @Override
    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }
    public MenuComponent getChild(int i){
     return  menuComponents.get(i);
    }
    public void print(){
        System.out.print("\n" + getName());
        System.out.println("," +getDescription());
        System.out.println("------------------");

        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            iterator.next().print();
        }
    }


}
