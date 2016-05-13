package main;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author arnal
 */
public class Menu extends MenuComponent
{
    protected ArrayList<MenuComponent> menuComponent;
    protected String name;
    protected String description;

    public Menu(String name, String description)
    {
        this.menuComponent = new ArrayList<>();
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent)
    {
        this.menuComponent.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent)
    {
        this.menuComponent.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i)
    {
        return this.menuComponent.get(i);
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public String getDescription()
    {
        return this.description;
    }

    @Override
    public void print()
    {
        System.out.print("\n" + getName());
        System.out.println(",   " + getDescription());
        System.out.println("-----------------------");
        
        Iterator iterator = this.menuComponent.iterator();
        while(iterator.hasNext())
        {
            MenuComponent mc = (MenuComponent)iterator.next();
            mc.print();
        }
    }

    //The remaining code has no changes
    @Override
    public Iterator createIterator() 
    {
        return new CompositeIterator(this.menuComponent.iterator());
    }
}
