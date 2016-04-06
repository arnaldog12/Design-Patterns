package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class MuteQuack implements QuackBehavior
{
    @Override
    public void quack() 
    {
        System.out.println("<< Silence >>");
    }
}
