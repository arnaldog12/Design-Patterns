package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory
{
    @Override
    public Dough createDough() 
    {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() 
    {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() 
    {
        return new ReggianoCheese();
    }
}
