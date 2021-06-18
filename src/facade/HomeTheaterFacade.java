package facade;

public class HomeTheaterFacade {
    Amplifier amp;
    DVDPlayer dvd;
    Projector projector;
    Screen screen;

    public HomeTheaterFacade(Amplifier amp, DVDPlayer dvd, Projector projector, Screen screen) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie");
        screen.down();
        projector.on();
        amp.on();
        amp.setDVD(dvd);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theatre down...");
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.off();
    }
}
