package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class Whip extends CondimentDecorator
{
    public Beverage beverage;
    
    public Whip(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() 
    {
        return this.beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() 
    {
        return 0.10 + this.beverage.cost();
    }
}
