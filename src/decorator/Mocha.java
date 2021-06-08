package decorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 0.20;
    }

    public String getDescription() {
        return super.getDescription() + ", Mocha";
    }
}
