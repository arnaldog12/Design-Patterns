package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class VolkswagenFactory implements CarFactory
{
    @Override
    public Car createCar() 
    {
        return new Gol();
    }
}
