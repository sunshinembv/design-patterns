package factory_method.ny_pizza;

import factory_method.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza(){
        name = "NY pizza (pepperoni)";
        dough = "NY dough (pepperoni)";
        sauce = "NY sauce (pepperoni)";

        toppings.add("NY topping (pepperoni)");
    }
}
