package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arnaldo Gualberto
 */
public class ShoppingCart 
{
    List<Item> items;
    
    public ShoppingCart()
    {
        this.items = new ArrayList<Item>();
    }
    
    public void addItem(Item item)
    {
        this.items.add(item);
    }
    
    public void removeItem(Item item)
    {
        this.items.remove(item);
    }
    
    public int calculateTotal()
    {
        int sum = 0;
        
        for (Item item : items) 
        {
            sum += item.price;
        }
        
        return sum;
    }
    
    public void pay(PaymentStrategy ps)
    {
        int amount = calculateTotal();
        ps.pay(amount);
    }
}
