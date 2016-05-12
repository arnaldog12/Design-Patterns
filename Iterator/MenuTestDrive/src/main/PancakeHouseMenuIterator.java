package main;

import java.util.ArrayList;

/**
 *
 * @author arnal
 */
public class PancakeHouseMenuIterator implements Iterator
{
    private ArrayList<MenuItem> items;
    private int position = 0;
    
    public PancakeHouseMenuIterator(ArrayList<MenuItem> items)
    {
        this.items = items;
    }
    
    @Override
    public boolean hasNext() 
    {
        if(this.position >= this.items.size() || this.items.get(this.position) == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    @Override
    public Object next()
    {
        MenuItem menuItem = this.items.get(this.position);
        this.position += 1;
        return menuItem;
    }
}
