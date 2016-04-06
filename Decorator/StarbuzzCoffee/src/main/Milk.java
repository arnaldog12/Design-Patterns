package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class Milk extends CondimentDecorator
{
    public Beverage beverage;
    
    public Milk(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() 
    {
        return this.beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() 
    {
        return 0.10 + this.beverage.cost();
    }
}
