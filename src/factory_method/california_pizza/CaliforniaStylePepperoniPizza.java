package factory_method.california_pizza;

import factory_method.Pizza;

public class CaliforniaStylePepperoniPizza extends Pizza {
    public CaliforniaStylePepperoniPizza(){
        name = "California pizza (pepperoni)";
        dough = "California dough (pepperoni)";
        sauce = "California sauce (pepperoni)";

        toppings.add("California topping (pepperoni)");
    }
}
