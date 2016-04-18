package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class FordFactory implements CarFactory
{
    @Override
    public HatchCar createHatchCar() 
    {
        return new FiestaHatch();
    }

    @Override
    public SedanCar createSedanCar() 
    {
        return new FiestaSedan();
    }
}
