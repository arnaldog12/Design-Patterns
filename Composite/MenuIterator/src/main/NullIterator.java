package main;

import java.util.Iterator;

/**
 *
 * @author arnal
 */
public class NullIterator implements Iterator
{
    @Override
    public boolean hasNext() 
    {
        return false;
    }

    @Override
    public Object next() 
    {
        return null;
    }
}
