package com.jetluo.patterns.combination;

/**
 * @ClassName MenuItem
 * @Description 菜单项，属于叶子
 * @Author jet
 * @Date 2022/4/24 22:54
 * @Version 1.0
 **/
public class MenuItem extends  MenuComponent{
    @Override
    public void print() {
        for ( int i =0;i < level;i++){
            System.out.print("--");
        }
        System.out.println(name);
    }

    public MenuItem(String name,int level) {
        this.name = name;
        this.level = level;
    }
}
