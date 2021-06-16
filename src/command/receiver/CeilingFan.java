package command.receiver;

public class CeilingFan {
    String location;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        System.out.println(location + " Ceiling fan is on high");
    }

    public void medium() {
        System.out.println(location + " Ceiling fan is on medium");
    }

    public void low() {
        System.out.println(location + " Ceiling fan is on low");
    }

    public void off() {
        System.out.println(location + " Ceiling fan is off");
    }
}
