package decorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Soy";
    }
}
