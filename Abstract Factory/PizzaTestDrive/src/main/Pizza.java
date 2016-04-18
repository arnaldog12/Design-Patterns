package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public abstract class Pizza 
{
    protected String name;
    
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    
    protected abstract void prepare();

    void bake() 
    {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() 
    {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() 
    {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) 
    {
        this.name = name;
    }

    String getName() 
    {
        return name;
    }
}
