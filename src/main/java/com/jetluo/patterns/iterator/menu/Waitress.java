package com.jetluo.patterns.iterator.menu;

/**
 * @ClassName Waitress
 * @Description TODO
 * @Author jet
 * @Date 2022/8/7 14:46
 * @Version 1.0
 **/
public class Waitress {
    private  MenuComponent allMenus;
    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }
    public void printMenu(){
        allMenus.print();;
    }
}
