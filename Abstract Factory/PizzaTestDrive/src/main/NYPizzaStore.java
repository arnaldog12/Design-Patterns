package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class NYPizzaStore extends PizzaStore
{
    @Override
    protected Pizza createPizza(String type) 
    {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza = null;
        
        if(type.equals("cheese"))
        {            
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");           
        }
        else if(type.equals("pepperoni"))
        {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        
        return pizza;
    }
}
