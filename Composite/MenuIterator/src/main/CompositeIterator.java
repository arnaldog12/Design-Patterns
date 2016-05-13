package main;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author arnal
 */
public class CompositeIterator implements Iterator
{
    private Stack stack;
    
    public CompositeIterator(Iterator iterator)
    {
        this.stack = new Stack();
        this.stack.push(iterator);
    }
    
    @Override
    public boolean hasNext() 
    {
        if(this.stack.empty())
        {
            return false;
        }
        else
        {
            Iterator iterator = (Iterator) this.stack.peek();
            if(!iterator.hasNext())
            {
                this.stack.pop();
                return hasNext();
            }
            else
            {
                return true;
            }
        }
    }

    @Override
    public Object next() 
    {
        if(hasNext())
        {
            Iterator iterator = (Iterator) this.stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if(component instanceof Menu)
            {
                this.stack.push(component.createIterator());
            }
            return component;
        }
        else
        {
            return null;
        }
    }
}
