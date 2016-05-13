package main;

import java.util.Iterator;

/**
 *
 * @author arnal
 */
public abstract class MenuComponent
{
    public void add(MenuComponent menuComponent)
    {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent)
    {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i)
    {
        throw new UnsupportedOperationException();
    }

    public String getName()
    {
        throw new UnsupportedOperationException();
    }

    public String getDescription()
    {
        throw new UnsupportedOperationException();
    }

    public double getPrice()
    {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian()
    {
        throw new UnsupportedOperationException();
    }
    
    //The remaining code has no changes
    public abstract Iterator createIterator();

    public void print()
    {
        throw new UnsupportedOperationException();
    }
}
