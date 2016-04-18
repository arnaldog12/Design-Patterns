package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory 
{
    @Override
    public Dough createDough() 
    {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() 
    {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() 
    {
        return new MozzarellaCheese();
    }
}
