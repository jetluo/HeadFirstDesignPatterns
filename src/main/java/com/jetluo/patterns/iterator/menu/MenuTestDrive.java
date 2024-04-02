package com.jetluo.patterns.iterator.menu;

/**
 * @ClassName MenuTestDrive
 * @Description TODO
 * @Author jet
 * @Date 2022/8/7 14:47
 * @Version 1.0
 **/
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu1= new Menu("PANCAKE HOUSE MENU1", "breakfast");
        MenuComponent pancakeHouseMenu2= new Menu("PANCAKE HOUSE MENU2", "breakfast");
        MenuComponent pancakeHouseMenu3= new Menu("PANCAKE HOUSE MENU3", "breakfast");
        MenuComponent pancakeHouseMenu4= new Menu("PANCAKE HOUSE MENU4", "breakfast");

        MenuComponent all= new Menu("ALL MENU", "ALL");
        all.add(pancakeHouseMenu1);
        all.add(pancakeHouseMenu2);
        all.add(pancakeHouseMenu3);
        all.add(pancakeHouseMenu4);

        pancakeHouseMenu2.add(new MenuItem("Pasta", "SDfasdf", true, 3.89));
        pancakeHouseMenu2.add(pancakeHouseMenu4);

        pancakeHouseMenu4.add(new MenuItem("APPLE", "asdf", true, 3.89));


        Waitress waitress= new Waitress(all);
        waitress.printMenu();
    }
}
