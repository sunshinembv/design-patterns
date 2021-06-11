package factory_method.chicago_pizza;

import factory_method.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Chicago pizza (cheese)";
        dough = "Chicago dough (cheese)";
        sauce = "Chicago sauce (cheese)";

        toppings.add("Chicago topping (cheese)");
    }
}
