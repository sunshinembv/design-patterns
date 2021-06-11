package factory_method.ny_pizza;

import factory_method.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name = "NY pizza (cheese)";
        dough = "NY dough (cheese)";
        sauce = "NY sauce (cheese)";

        toppings.add("NY topping (cheese)");
    }
}
