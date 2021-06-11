package factory_method;

import factory_method.ny_pizza.NYStyleCheesePizza;
import factory_method.ny_pizza.NYStylePepperoniPizza;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
