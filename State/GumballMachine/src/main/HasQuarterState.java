package main;

/**
 *
 * @author arnaldo
 */
public class HasQuarterState implements State
{
    private GumballMachine gumballMachine;
         
    public HasQuarterState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }            
    
    @Override
    public void insertQuarter() 
    {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() 
    {
        System.out.println("Quarter returned");
        this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() 
    {
        System.out.println("You turned...");
        this.gumballMachine.setState(this.gumballMachine.getSoldState());
    }

    @Override
    public void dispense() 
    {
        System.out.println("No gumball dispensed");
    }    
    
    @Override
    public String toString()
    {
        return "waiting for turn of crank";
    }
}
