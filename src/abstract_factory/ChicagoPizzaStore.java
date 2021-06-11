package abstract_factory;


import abstract_factory.pizza_types.CheesePizza;
import abstract_factory.pizza_types.ClamPizza;
import abstract_factory.pizza_types.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Clam Pizza");
        }
        return pizza;
    }
}
