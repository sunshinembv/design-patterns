package command.receiver;

public class Stereo {
    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Stereo is on");
    }

    public void off() {
        System.out.println(location + " Stereo is off");
    }

    public void setCD() {
        System.out.println(location + " Stereo Set CD");
    }

    public void setDvd() {
        System.out.println(location + " Stereo Set DVD");
    }

    public void setRadio() {
        System.out.println(location + " Stereo Set Radio");
    }

    public void setVolume(int volume) {
        System.out.println(location + " Stereo Set Volume: " + volume);
    }
}
