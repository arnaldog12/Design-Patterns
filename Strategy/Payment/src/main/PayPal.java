package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class PayPal implements PaymentStrategy
{
    public String emailId;
    public String password;
    
    public PayPal(String emailId, String password)
    {
        this.emailId = emailId;
        this.password = password;
    }
    
    @Override
    public void pay(int amount) 
    {
        System.out.println(amount+" paid using PayPal.");
    }
}
