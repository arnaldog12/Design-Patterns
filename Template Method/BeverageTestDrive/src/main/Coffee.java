package main;

/**
 *
 * @author arnal
 */
public class Coffee extends CaffeineBeverage
{
    @Override
    protected void brew() 
    {
        System.out.println("Dripping Coffe through filter");
    }

    @Override
    protected void addCondiments() 
    {
        System.out.println("Adding sugar and Milk");
    }
}
