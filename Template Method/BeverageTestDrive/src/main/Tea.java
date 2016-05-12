package main;

/**
 *
 * @author arnal
 */
public class Tea extends CaffeineBeverage
{
    @Override
    protected void brew() 
    {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() 
    {
        System.out.println("Adding Lemon");
    }
    
    //Hook Method
    @Override
    protected boolean customerWantsCondiments()
    {
        return false;
    }
}
