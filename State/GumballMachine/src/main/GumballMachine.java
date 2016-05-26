package main;

/**
 *
 * @author arnaldo
 */
public class GumballMachine 
{
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    
    private State state = soldOutState;
    private int count = 0;
    
    public GumballMachine(int numberGumballs)
    {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        
        this.count = numberGumballs;
        if(numberGumballs > 0)
        {
            this.state = noQuarterState;
        }
    }
    
    public void insertQuarter()
    {
        this.state.insertQuarter();
    }
    
    public void ejectQuarter()
    {
        this.state.ejectQuarter();
    }
    
    public void turnCrank()
    {
        this.state.turnCrank();
        this.state.dispense();
    }
    
    protected void setState(State state)
    {
        this.state = state;
    }
    
    protected void releaseBall()
    {
        System.out.println("A gumball comes rolling out the slot...");
        if(this.count != 0)
        {
            this.count = this.count - 1;
        }
    }
    
    protected int getCount()
    {
        return this.count;
    }
    
    protected void refill(int count)
    {
        this.count = count;
        this.state = noQuarterState;
    }
    
    public State getState()
    {
        return this.state;
    }
    
    public State getSoldOutState()
    {
        return this.soldOutState;
    }
    
    public State getNoQuarterState()
    {
        return this.noQuarterState;
    }
    
    public State getHasQuarterState()
    {
        return this.hasQuarterState;
    }
    
    public State getSoldState()
    {
        return this.soldState;
    }
    
    @Override
    public String toString()
    {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + this.count + " gumball");
        if (count != 1) 
        {
                result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + this.state + "\n");
        return result.toString();
    }
}
