package main;

/**
 *
 * @author arnal
 */
public class HomeTheaterFacade 
{
    Amplifier amp;
    CdPlayer cd;
    DvdPlayer dvd;
    PopcornPopper popper;
    Projector projector;
    Screen screen;
    TheaterLights lights;
    Tuner tuner;
    
    public HomeTheaterFacade(Amplifier amp, CdPlayer cd, DvdPlayer dvd, PopcornPopper popper, Projector projector, Screen screen, TheaterLights lights, Tuner tuner)
    {
        this.amp = amp;
        this.cd = cd;
        this.dvd = dvd;
        this.popper = popper;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.tuner = tuner;
    }
    
    public void watchMovie(String movie)
    {
        System.out.println("Get ready for watch a movie...");
        this.popper.on();
        this.popper.pop();
        this.lights.dim(10);
        this.screen.down();
        this.projector.on();
        this.projector.wideScreenMode();
        this.amp.on();
        this.amp.setDvd(dvd);
        this.amp.setSurroundSound();
        this.amp.setVolume(5);
        this.dvd.on();
        this.dvd.play(movie);
    }
    
    public void endMovie()
    {
        System.out.println("Shutting movie theater down...");
        this.popper.off();
        this.lights.on();
        this.screen.up();
        this.projector.off();
        this.amp.off();
        this.dvd.stop();
        this.dvd.eject();
        this.dvd.off();
    }
}
