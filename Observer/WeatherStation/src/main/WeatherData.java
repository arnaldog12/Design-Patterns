package main;

import java.util.ArrayList;

/**
 *
 * @author Arnaldo Gualberto
 */
public class WeatherData implements Subject
{
    public ArrayList<Observer> observers;
    public float temperature;
    public float humidity;
    public float pressure;

    public WeatherData()
    {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer obs)
    {
        this.observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs)
    {
        this.observers.remove(obs);
    }

    @Override
    public void notifyObservers()
    {
        for (Observer obs : observers) 
        {
            obs.update(this);
        }
    }

    public void measurementsChanged()
    {
        this.notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    public float getTemperature()
    {
        return this.temperature;
    }

    public float getHumidity(){
        return this.humidity;
    }

    public float getPressure()
    {
        return this.pressure;
    }
}
