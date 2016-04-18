package main;

import java.util.ArrayList;

/**
 *
 * @author Arnaldo Gualberto
 */
public abstract class Pizza 
{
    protected String name;
    protected String dough;//tipo de massa
    protected String sauce;//molho
    protected ArrayList<String> toppings;
    
    public Pizza()
    {
        this.toppings = new ArrayList<String>();
    }
    
    protected void prepare()
    {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) 
        {
            System.out.println("\t" + topping);
        }
    }
    
    protected void bake()
    {
        System.out.println("Bake for 25 minutes at 350ºC");
    }
    
    protected void cut()
    {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    
    protected void box()
    {
        System.out.println("Place pizza in official PizzaStore box");
    }
    
    public String getName()
    {
        return this.name;
    }    
}
