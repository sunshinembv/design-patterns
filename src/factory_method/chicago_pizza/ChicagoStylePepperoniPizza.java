package factory_method.chicago_pizza;

import factory_method.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza(){
        name = "Chicago pizza (pepperoni)";
        dough = "Chicago dough (pepperoni)";
        sauce = "Chicago sauce (pepperoni)";

        toppings.add("Chicago topping (pepperoni)");
    }
}
