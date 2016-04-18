package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class NYStylePizzaStore extends PizzaStore
{
    @Override
    protected Pizza createPizza(String type) 
    {
        if (type.equals("cheese"))
        {
            return new NYStyleCheesePizza();
        }
        else if(type.equals("pepperoni"))
        {
            return new NYStylePepperoniPizza();
        }
        else
        {
            return null;
        }
    }
}
