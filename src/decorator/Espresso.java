package decorator;

public class Espresso implements Beverage {
    String description;

    public Espresso(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
