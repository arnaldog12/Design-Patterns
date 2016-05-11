package main;

/**
 *  Low Performance
 *  Thread Safe
 * 
 * @author Arnaldo Gualberto
 */
public class Singleton3 
{
    private volatile static Singleton3 uniqueInstance;
    
    //another instance variables
    
    private Singleton3()
    {
        
    }
    
    public static Singleton3 getInstance()
    {
        if(uniqueInstance == null)
        {
            synchronized (Singleton3.class)
            {
                if(uniqueInstance == null)
                {
                    uniqueInstance = new Singleton3();
                }
            }
        }
        
        return uniqueInstance;
    }
    
    //another methods
    
}
