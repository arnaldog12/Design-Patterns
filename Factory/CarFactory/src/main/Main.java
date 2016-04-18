package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Car car;
        
        CarFactory fiatFactory = new FiatFactory();
        CarFactory fordFactory = new FordFactory();  
        CarFactory volksFactory = new VolkswagenFactory();        
        CarFactory chevroletFactory = new ChevroletFactory();        
        
        car = fiatFactory.createCar();
        car.showInfo();
        
        car = fordFactory.createCar();
        car.showInfo();
        
        car = volksFactory.createCar();
        car.showInfo();
        
        car = chevroletFactory.createCar();
        car.showInfo();
    }
}
