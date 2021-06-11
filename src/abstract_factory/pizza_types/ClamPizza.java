package abstract_factory.pizza_types;

import abstract_factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing: " + name);
        dough = ingredientFactory.createDough();
        System.out.println("-----Dough: " + dough.toString() + "-----");
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
