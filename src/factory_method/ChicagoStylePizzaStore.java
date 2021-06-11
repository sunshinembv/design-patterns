package factory_method;

import factory_method.chicago_pizza.ChicagoStyleCheesePizza;
import factory_method.chicago_pizza.ChicagoStylePepperoniPizza;

public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
