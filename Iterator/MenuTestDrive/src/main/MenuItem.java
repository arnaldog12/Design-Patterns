package main;

public class MenuItem 
{
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name,
            String description,
            boolean vegetarian,
            double price) 
    {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() 
    {
        return name;
    }

    public String getDescription() 
    {
        return description;
    }

    public double getPrice() 
    {
        return price;
    }

    public boolean isVegetarian() 
    {
        return vegetarian;
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(", ");
        sb.append(this.price).append(" -- ");
        sb.append(this.description);
        return sb.toString();
    }
}
