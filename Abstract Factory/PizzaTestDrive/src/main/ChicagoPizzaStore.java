package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class ChicagoPizzaStore extends PizzaStore
{
    @Override
    protected Pizza createPizza(String type) 
    {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        Pizza pizza = null;
        
        if (type.equals("cheese")) 
        {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } 
        else if (type.equals("pepperoni")) 
        {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        
        return pizza;
    }
}
