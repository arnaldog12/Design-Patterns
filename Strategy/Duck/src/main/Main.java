package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
        
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.setQuackBehavior(new MuteQuack());
        modelDuck.performFly();
        modelDuck.performQuack();
    }
    
}
