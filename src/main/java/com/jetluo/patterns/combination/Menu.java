package com.jetluo.patterns.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Menu
 * @Description 树枝节点
 * @Author jet
 * @Date 2022/4/24 22:47
 * @Version 1.0
 **/
public class Menu extends MenuComponent {
    private List<MenuComponent> menus = new ArrayList<MenuComponent>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menus.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menus.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menus.get(index);
    }

    @Override
    public void print() {
        for ( int i =0;i < level;i++){
            System.out.print("--");
        }
        System.out.println(name);
        for (MenuComponent menu : menus) {
            menu.print();
        }
    }
}
