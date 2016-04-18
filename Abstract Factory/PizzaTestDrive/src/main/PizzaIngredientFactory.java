package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public interface PizzaIngredientFactory 
{
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
}
