package decorator;

public class HouseBlend implements Beverage {
    String description;

    public HouseBlend(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 0.9;
    }
}
