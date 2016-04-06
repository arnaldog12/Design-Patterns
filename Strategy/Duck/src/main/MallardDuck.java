package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class MallardDuck extends Duck
{
    
    public MallardDuck()
    {
        super.flyBehavior = new FlyWithWings();
        super.quackBehavior = new Quack();
    }

    @Override
    public void display() 
    {
        System.out.println("I'm a real Mallard Duck");
    }

}
