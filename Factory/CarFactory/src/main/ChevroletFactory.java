package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class ChevroletFactory implements CarFactory
{
    @Override
    public Car createCar() 
    {
        return new Celta();
    }
}
