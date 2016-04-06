package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class Espresso extends Beverage
{
    public Espresso()
    {
        this.description = "Espresso Coffee";
    }
    
    @Override
    public double cost() 
    {
        return 1.99;
    }
}
