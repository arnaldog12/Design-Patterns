package main;

import java.util.ArrayList;

/**
 *
 * @author arnal
 */
public class Main 
{
    public static void main(String[] args) 
    {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        
        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        
        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
