package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class PepperoniPizza extends Pizza
{
    protected PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory)
    {
        this.ingredientFactory = ingredientFactory;
    }
    
    @Override
    protected void prepare() 
    {
        System.out.println("Preparing "+name);
        this.dough = this.ingredientFactory.createDough();
        this.sauce = this.ingredientFactory.createSauce();
        this.cheese = this.ingredientFactory.createCheese();
    }
}
