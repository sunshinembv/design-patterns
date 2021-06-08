package decorator;

public class DarkRoast implements Beverage {
    String description;

    public DarkRoast(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 1.59;
    }
}
