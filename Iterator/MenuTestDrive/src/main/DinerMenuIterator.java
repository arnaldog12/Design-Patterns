package main;

/**
 *
 * @author arnal
 */
public class DinerMenuIterator implements Iterator
{
    private MenuItem[] items;
    private int position = 0;
    
    public DinerMenuIterator(MenuItem[] items)
    {
        this.items = items;
    }
    
    @Override
    public boolean hasNext() 
    {
        if(this.position >= this.items.length || this.items[this.position] == null)
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
        MenuItem menuItem = this.items[position];
        this.position += 1;
        return menuItem;
    }
}
