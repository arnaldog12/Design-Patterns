package main;

/**
 *
 * @author arnal
 */
public class MenuItem extends MenuComponent
{
    protected String name;
    protected String description;
    protected boolean vegetarian;
    protected double price;

    public MenuItem(String name, String description, boolean vegetarian, double price)
    {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public String getDescription()
    {
        return this.description;
    }

    @Override
    public double getPrice()
    {
        return this.price;
    }

    @Override
    public boolean isVegetarian()
    {
        return this.vegetarian;
    }

    @Override
    public void print()
    {
        System.out.print("    " + getName());
        if(isVegetarian())
        {
            System.out.print("(v)");
        }
        
        System.out.println("," + getPrice());
        System.out.println("    -- " + getDescription());
    }
}
