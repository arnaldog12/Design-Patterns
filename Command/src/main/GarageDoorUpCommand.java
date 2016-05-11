package main;

/**
 *
 * @author arnal
 */
public class GarageDoorUpCommand implements Command
{
    public GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) 
    {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() 
    {
        this.garageDoor.up();
    }

    @Override
    public void undo() 
    {
        this.garageDoor.down();
    }
}
