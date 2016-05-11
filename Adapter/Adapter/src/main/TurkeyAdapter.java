package main;

/**
 *
 * @author arnal
 */
public class TurkeyAdapter implements Duck
{
    public Turkey turkey;
    
    public TurkeyAdapter(Turkey turkey)
    {
        this.turkey = turkey;
    }
    
    @Override
    public void quack() 
    {
        this.turkey.gobble();
    }

    @Override
    public void fly() 
    {
        for(int i = 0; i < 5; ++i)
        {
            this.turkey.fly();
        }
    }
}
