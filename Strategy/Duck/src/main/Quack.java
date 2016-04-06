package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class Quack implements QuackBehavior
{
    @Override
    public void quack() 
    {
        System.out.println("Quack");
    }
}
