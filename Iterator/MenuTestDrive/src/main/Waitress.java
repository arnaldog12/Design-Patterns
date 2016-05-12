package main;

import java.util.ArrayList;

/**
 *
 * @author arnal
 */
public class Waitress 
{
    public ArrayList<Menu> menus;
    
    public Waitress(ArrayList<Menu> menus)
    {
        this.menus = menus;
    }
    
    public void printMenu()
    {
        for (Menu menu : menus) 
        {
            printMenu(menu.createIterator());            
        }
    }
     
    public void printVegetarianMenu()
    {
        for (Menu menu : menus) 
        {
            printVegetarianMenu(menu.createIterator());            
        }
    }
    
    private void printMenu(Iterator iterator)
    {
        while(iterator.hasNext())
        {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.toString());
        }
        System.out.println("");
    }
    
    private void printVegetarianMenu(Iterator iterator)
    {
        while(iterator.hasNext())
        {
            MenuItem menuItem = (MenuItem) iterator.next();
            if(menuItem.isVegetarian())
            {
                System.out.println(menuItem.toString());
            }
        }
        System.out.println("");
    }
}
