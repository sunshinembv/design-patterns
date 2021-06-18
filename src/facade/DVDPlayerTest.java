package facade;

public class DVDPlayerTest implements DVDPlayer {

    @Override
    public void on() {
        System.out.println("DVD is on");
    }

    @Override
    public void off() {
        System.out.println("DVD is off");
    }

    @Override
    public void play(String movie) {
        System.out.println("DVD is play: " + movie);
    }

    @Override
    public void pause() {
        System.out.println("DVD is pause");
    }

    @Override
    public void stop() {
        System.out.println("DVD is stop");
    }
}
