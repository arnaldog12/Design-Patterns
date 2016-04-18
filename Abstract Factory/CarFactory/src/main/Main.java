package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class Main 
{
    public static void main(String[] args) 
    {
        CarFactory fiatFactory = new FiatFactory();
        CarFactory fordFactory = new FordFactory();
        HatchCar hatch;
        SedanCar sedan;
        
        hatch = fiatFactory.createHatchCar();
        hatch.showHatchInfo();
        sedan = fiatFactory.createSedanCar();
        sedan.showSedanInfo();
        
        hatch = fordFactory.createHatchCar();
        hatch.showHatchInfo();
        sedan = fordFactory.createSedanCar();
        sedan.showSedanInfo();        
    }
}
