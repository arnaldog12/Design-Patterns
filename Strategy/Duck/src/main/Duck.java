package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public abstract class Duck 
{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck()
    {
        
    }
    
    public abstract void display();
    
    public void performFly()
    {
        this.flyBehavior.fly();
    }
    
    public void performQuack()
    {
        this.quackBehavior.quack();
    }
    
    public void setFlyBehavior(FlyBehavior fb)
    {
        this.flyBehavior = fb;
    }
    
    public void setQuackBehavior(QuackBehavior qb)
    {
        this.quackBehavior = qb;
    }
    
    public void swin()
    {
        System.out.println("All ducks float, even decoys!");
    }
}
