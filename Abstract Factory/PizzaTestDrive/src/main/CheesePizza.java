package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class CheesePizza extends Pizza
{
    protected PizzaIngredientFactory ingredientFactory;
    
    public CheesePizza(PizzaIngredientFactory ingredientFactory)
    {
        this.ingredientFactory = ingredientFactory;
    }
    
    @Override
    protected void prepare() 
    {
        System.out.println("Preparing " + name);
        this.dough = this.ingredientFactory.createDough();
        this.sauce = this.ingredientFactory.createSauce();
        this.cheese = this.ingredientFactory.createCheese();
    }
}
