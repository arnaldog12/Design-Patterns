package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public abstract class PizzaStore 
{
    public Pizza orderPizza(String type)
    {
        Pizza pizza = createPizza(type);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
    
    //factory method
    protected abstract Pizza createPizza(String type);
}
