package decorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 0.25;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Whip";
    }
}
