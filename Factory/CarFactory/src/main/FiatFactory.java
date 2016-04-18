package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class FiatFactory implements CarFactory
{
    @Override
    public Car createCar() 
    {
        return new Palio();
    }
}
