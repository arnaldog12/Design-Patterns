package main;

/**
 *
 * @author arnal
 */
public class RemoteControl 
{
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;
    
    private static final int numSlots = 7;
    
    public RemoteControl()
    {
        this.onCommands = new Command[numSlots];
        this.offCommands = new Command[numSlots];
        
        Command noCommand = new NoCommand();
        for (int i = 0; i < numSlots; i++) 
        {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }
    
    public void setCommand(int slot, Command onCommand, Command offCommand)
    {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot]= offCommand;
    }
    
    public void onButtonWasPushed(int slot)
    {
        this.onCommands[slot].execute();
        this.undoCommand = this.onCommands[slot];
    }
    
    public void offButtonWasPushed(int slot)
    {
        this.offCommands[slot].execute();
        this.undoCommand = this.offCommands[slot];
    }
    
    public void undoButtonsWasPushed()
    {
        this.undoCommand.undo();
    }
    
    public String toString() 
    {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
