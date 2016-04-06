package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Beverage beverage = new Espresso();
        System.out.println(String.format("$%s: %s", beverage.cost(), beverage.getDescription()));
        
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(String.format("$%s: %s", beverage2.cost(), beverage2.getDescription()));
        
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(String.format("$%s: %s", beverage3.cost(), beverage3.getDescription()));
    }
}
