package main;

/**
 *
 * @author arnal
 */
public class Main 
{
    public static void main(String[] args) 
    {
        MallardDuck duck = new MallardDuck();
        
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();
        
        System.out.println("\nThe Duck says...");
        duck.quack();
        duck.fly();
        
        System.out.println("\nThe TurkeyAdapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
