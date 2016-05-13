package main;

/**
 *
 * @author arnal
 */
public class Waitress 
{
    private MenuComponent allMenus;
    
    public Waitress(MenuComponent allMenus)
    {
        this.allMenus = allMenus;
    }
    
    public void printMenu()
    {
        this.allMenus.print();
    }
}
