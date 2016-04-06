package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class Main
{
    public static void main(String[] args) 
    {
       ShoppingCart cart = new ShoppingCart();
       
       cart.addItem(new Item("1234", 10));
       cart.addItem(new Item("5678", 40));

       cart.pay(new CreditCard("Arnaldo Gualberto", "1234567890", "748", "12/15"));
       
       cart.pay(new PayPal("arnaldo.g12@gmail.com", "123456"));
    }
    
}
