package factory_method.california_pizza;

import factory_method.Pizza;

public class CaliforniaStyleCheesePizza extends Pizza {
    public CaliforniaStyleCheesePizza(){
        name = "California pizza (cheese)";
        dough = "California dough (cheese)";
        sauce = "California sauce (cheese)";

        toppings.add("California topping (cheese)");
    }
}
