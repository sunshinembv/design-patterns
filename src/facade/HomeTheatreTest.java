package facade;

public class HomeTheatreTest {
    public static void main(String[] args) {
        Amplifier amp = new AmplifierTest();
        DVDPlayer dvd = new DVDPlayerTest();
        Projector projector = new ProjectorTest();
        Screen screen = new ScreenTest();

        HomeTheaterFacade homeTheatre = new HomeTheaterFacade(amp, dvd, projector, screen);

        homeTheatre.watchMovie("Film 1");
        homeTheatre.endMovie();
    }
}
