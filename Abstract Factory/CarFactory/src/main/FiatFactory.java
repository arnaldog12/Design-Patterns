package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class FiatFactory implements CarFactory
{
    @Override
    public HatchCar createHatchCar() 
    {
        return new PalioHatch();
    }

    @Override
    public SedanCar createSedanCar() 
    {
        return new PalioSedan();
    }
}
