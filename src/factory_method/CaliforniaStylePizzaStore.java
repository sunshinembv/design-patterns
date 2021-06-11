package factory_method;

import factory_method.california_pizza.CaliforniaStyleCheesePizza;
import factory_method.california_pizza.CaliforniaStylePepperoniPizza;

public class CaliforniaStylePizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new CaliforniaStyleCheesePizza();
        } else if (item.equals("pepperoni")) {
            return new CaliforniaStylePepperoniPizza();
        } else return null;
    }
}
