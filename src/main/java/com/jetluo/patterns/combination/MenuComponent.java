package com.jetluo.patterns.combination;

/**
 * @ClassName MenuComponent
 * @Description 菜单组件；属于抽象根节点
 * @Author jet
 * @Date 2022/4/24 22:40
 * @Version 1.0
 **/
public abstract class MenuComponent {
    //菜单组件的名称
    protected String name;
    //菜单组件的层级
    protected int level;
    // 添加子菜单
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    //移除子菜单
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    //获取指定子菜单
    public  MenuComponent getChild(int index){
        throw new UnsupportedOperationException();
    }
    //获取菜单名
    public String getName(){
        return name;
    }
    public abstract void print();

}
