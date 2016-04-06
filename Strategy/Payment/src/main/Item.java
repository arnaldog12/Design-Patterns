package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class Item 
{
    public String upcCode;
    public int price;
    
    public Item(String upcCode, int price)
    {
        this.upcCode = upcCode;
        this.price = price;
    }        
    
    public String getUpcCode()
    {
        return this.upcCode;
    }
    
    public int getPrice()
    {
        return this.price;
    }
}
