package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class Squeak implements QuackBehavior
{
    @Override
    public void quack() 
    {
        System.out.println("Squeak");
    }
}
