package main;

/**
 *
 * @author arnal
 */
public class GarageDoorDownCommand implements Command
{
    public GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) 
    {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() 
    {
        this.garageDoor.down();
    }

    @Override
    public void undo() 
    {
        this.garageDoor.up();
    }
}
