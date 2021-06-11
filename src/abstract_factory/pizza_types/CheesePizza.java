package abstract_factory.pizza_types;

import abstract_factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing: " + name);
        dough = ingredientFactory.createDough();
        System.out.println("-----Dough: " + dough.toString() + "-----");
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
