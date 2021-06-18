package facade;

public class AmplifierTest implements Amplifier {

    @Override
    public void on() {
        System.out.println("Amplifier is on");
    }

    @Override
    public void off() {
        System.out.println("Amplifier is off");
    }

    @Override
    public void setDVD(DVDPlayer dvd) {
        System.out.println("Amplifier set DVD: " + dvd);
    }
}
