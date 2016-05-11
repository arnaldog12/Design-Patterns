package main;

/**
 *  High Performance
 *  Thread Safe
 * 
 * @author Arnaldo Gualberto
 */
public class Singleton2 
{
    private static Singleton2 uniqueInstance = new Singleton2();
    
    //another instance variables
    
    private Singleton2()
    {
    
    }
    
    public static Singleton2 getInstance()
    {
        return uniqueInstance;
    }
    
    //another methods
    
}
