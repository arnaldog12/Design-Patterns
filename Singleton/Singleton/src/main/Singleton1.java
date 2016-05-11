package main;

/**
 *  Low Performance
 *  Thread Safe
 * 
 * @author Arnaldo Gualberto
 */
public class Singleton1 
{
    private static Singleton1 uniqueInstance;
    
    //another instance variables
    
    private Singleton1()
    {
        
    }
    
    public static synchronized Singleton1 getInstance()
    {
        if(uniqueInstance == null)
        {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }
    
    //another methods
}
