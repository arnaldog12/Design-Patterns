package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class CreditCard implements PaymentStrategy
{
    public String name;
    public String cardNumber;
    public String cvv;
    public String dateOfExpiry;
    
    public CreditCard(String name, String cardNumber, String cvv, String dateOfExpiry)
    {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }
    
    @Override
    public void pay(int amount) 
    {
        System.out.println(amount+" paid with Credit Card.");
    }
}
