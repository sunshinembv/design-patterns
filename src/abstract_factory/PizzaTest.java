package abstract_factory;


import abstract_factory.pizza_types.Pizza;

public class PizzaTest {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("clam");
        System.out.println("Pizza 1: " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Pizza 2: " + pizza.getName() + "\n");
    }
}
