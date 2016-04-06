package main;

import java.util.LinkedList;

/**
 *
 * @author Arnaldo Gualberto
 */
public class StatisticsDisplay implements Observer, Display
{
    public Subject weatherData;
    public float maxTemp;
    public float minTemp;
    public float sumTemp;
    public int numReadings;
    
    public StatisticsDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
        
        this.minTemp = Float.MAX_VALUE;
        this.maxTemp = Float.MIN_VALUE;
        this.numReadings = 0;
    }

    @Override
    public void update(Subject sub) 
    {
        if(sub instanceof WeatherData)
        {            
            this.weatherData = sub;
            WeatherData wd = (WeatherData) sub;
            
            float temp = wd.getTemperature();
            if(temp < this.minTemp)
                this.minTemp = temp;
            
            if(temp > this.maxTemp)
                this.maxTemp = temp;
            
            this.sumTemp += temp;
            this.numReadings++;
            
            this.display();
        }
    }

    @Override
    public void display() 
    {
        WeatherData wd = (WeatherData)this.weatherData;
        System.out.println(String.format("Temperature Min/Max/Avg: %s/%s/%s", this.minTemp, this.maxTemp, (this.sumTemp/this.numReadings)));
    }

}
