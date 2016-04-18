package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class FordFactory implements CarFactory
{
    @Override
    public Car createCar() 
    {
        return new Fiesta();
    }
}
