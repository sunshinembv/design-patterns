package facade;

public class ScreenTest implements Screen {

    @Override
    public void up() {
        System.out.println("Screen is up");
    }

    @Override
    public void down() {
        System.out.println("Screen is down");
    }
}
