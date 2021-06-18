package facade;

public class ProjectorTest implements Projector {

    @Override
    public void on() {
        System.out.println("Projector is on");
    }

    @Override
    public void off() {
        System.out.println("Projector is off");
    }
}
