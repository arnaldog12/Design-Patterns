package main;

/**
 *
 * @author arnal
 */
public class LightOnCommand implements Command
{
    public Light light;
    
    public LightOnCommand(Light light)
    {
        this.light = light;
    }
    
    @Override
    public void execute() 
    {
        this.light.on();
    }

    @Override
    public void undo() 
    {
        this.light.off();
    }
}
