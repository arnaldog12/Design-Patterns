package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class CurrentConditionsDisplay implements Observer, Display
{
    public Subject weatherData;
    
    public CurrentConditionsDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }
    
    @Override
    public void update(Subject sub) 
    {
        this.weatherData = sub;
        this.display();
    }

    @Override
    public void display() 
    {
        if(this.weatherData instanceof WeatherData)
        {
            WeatherData wd = (WeatherData)this.weatherData;
            System.out.println("Current Conditions: "+wd.getTemperature()+"ºC and "+wd.getHumidity()+"% humidity");
        }
    }
}
