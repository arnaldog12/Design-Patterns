package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class Mocha extends CondimentDecorator
{
    public Beverage beverage;
    
    public Mocha(Beverage beverage)
    {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() 
    {
        return this.beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() 
    {
        return 0.2 + this.beverage.cost();
    }
}
