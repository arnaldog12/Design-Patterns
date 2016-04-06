package main;

/**
 *
 * @author Arnaldo Gualberto
 */
public class Main 
{
    public static void main(String[] args) 
    {
        WeatherData wd = new WeatherData();
        
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(wd);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(wd);
        
        wd.setMeasurements(30.0f, 20.0f, 30.4f);
        wd.setMeasurements(32.5f, 45.0f, 8.9f);
        wd.setMeasurements(40.0f, 70.0f, 29.0f);
    }    
}
