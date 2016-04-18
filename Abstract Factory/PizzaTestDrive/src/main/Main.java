package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class Main 
{
    public static void main(String[] args) 
    {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+ pizza.getName() + "\n");
        
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a "+ pizza.getName() + "\n");
        
        pizza = nyStore.orderPizza("pepperoni");        
        System.out.println("Ethan ordered a "+ pizza.getName() + "\n");
        
        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a "+ pizza.getName() + "\n");
    }
}
