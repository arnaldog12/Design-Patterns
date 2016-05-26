package main;

/**
 *
 * @author arnaldo
 */
public class SoldState implements State
{
    private GumballMachine gumballMachine;
    
    public SoldState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() 
    {
        System.out.println("Please wait, we're alreay giving you a gumball");
    }

    @Override
    public void ejectQuarter() 
    {
        System.out.println("Sorry, you are already turned the crank");
    }

    @Override
    public void turnCrank() 
    {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() 
    {
        this.gumballMachine.releaseBall();
        if(gumballMachine.getCount() > 0)
        {
            this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
        }
        else
        {
            System.out.println("Oops, out of gumballs!");
            this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
        }
    }
    
    @Override
    public String toString()
    {
        return "dispensing a gumball";
    }
}
