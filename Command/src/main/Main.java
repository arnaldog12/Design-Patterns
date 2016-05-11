package main;

/**
 *
 * @author arnal
 */
public class Main 
{
    public static void main(String[] args) 
    {
        RemoteControl remote = new RemoteControl();
        
        Light livingRoomLight = new Light("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        GarageDoorUpCommand garageUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDown = new GarageDoorDownCommand(garageDoor);
        
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, garageUp, garageDown);
        
        System.out.println(remote.toString());
        
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.undoButtonsWasPushed();
        
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        remote.undoButtonsWasPushed();        
    }    
}
